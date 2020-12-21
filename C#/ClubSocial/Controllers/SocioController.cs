using ClubSocial.Acceso_Datos;
using ClubSocial.Models;
using ClubSocial.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ClubSocial.Controllers
{
    public class SocioController : Controller
    {
        #region Get Alta de Socio
        public ActionResult AltaSocio()
        {
            List<TipoDoc_vm> listatipoDoc = AD_Listar.ListadoTipoDoc();

            List<SelectListItem> ListItemTipoDoc = listatipoDoc.ConvertAll(d =>
            {
                return new SelectListItem()
                {
                    Text = d.nombre_tipoDoc,
                    Value = d.id_tipoDoc.ToString(),
                    Selected = false
                };
            });

            ViewBag.itemsTipoDoc = ListItemTipoDoc;


            List<Deportes_vm> listaDeportes = AD_Listar.ListaDeportes();

            List<SelectListItem> ListItemDeportes = listaDeportes.ConvertAll(d =>
            {
                return new SelectListItem()
                {
                    Text = d.nombre_deporte,
                    Value = d.Id_deporte.ToString(),
                    Selected = false
                };
            });


            ViewBag.itemsDeporte = ListItemDeportes;

            return View();
        }

        #endregion

        #region Post Alta de Socio
        [HttpPost]
        public ActionResult AltaSocio(Socio model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AD_Alta.InsertarNuevoSocio(model);
                if (resultado)
                {
                    return RedirectToAction("ListadoSocio", "Socio");
                }
                else
                {
                    return View(model);
                }

            }
            else
            {
                return View(model);
            }

        }
        #endregion


        #region Get Lista de Socio
        public ActionResult ListadoSocio()
        {
            List<Socio> lista = AD_Listar.ListadoSocio();
            return View(lista);
        }
        #endregion


        #region Get Reporte
        public ActionResult Reporte()
        {

            List<CantidadSocioPorTipoDeporte> resultado = AD_Reporte.ObtenerReporte();

            return View(resultado);
        }
        #endregion


        #region Get Actualizar Datos
        public ActionResult ActualizarDatos(int idSocio)
        {

            List<TipoDoc_vm> tipoDoc = AD_Listar.ListadoTipoDoc();

            List<SelectListItem> listaTipoDoc = tipoDoc.ConvertAll(d =>
            {
                return new SelectListItem()
                {
                    Text = d.nombre_tipoDoc,
                    Value = d.id_tipoDoc.ToString(),
                    Selected = false
                };
            });

            List<Deportes_vm> idDeporte = AD_Listar.ListaDeportes();
            List<SelectListItem> ListDeporte = idDeporte.ConvertAll(d =>
            {
                return new SelectListItem()
                {
                    Text = d.nombre_deporte,
                    Value = d.Id_deporte.ToString(),
                    Selected = false
                };
            });


            Socio resultado = AD_Actualizar.ObtenerSocio(idSocio);

            foreach (var item in listaTipoDoc)
            {
                if (item.Value.Equals(resultado.id_tipoDoc.ToString()))
                {
                    item.Selected = true;
                    break;
                }
            }
            ViewBag.vb_TipoDoc = listaTipoDoc;


            foreach (var item in ListDeporte)
            {
                if (item.Value.Equals(resultado.id_deporte.ToString()))
                {
                    item.Selected = true;
                    break;
                }
            }
            ViewBag.vb_IdDeporte = ListDeporte;


            ViewBag.nombre = resultado.nombre + " " + resultado.apellido;
            return View(resultado);
        }
        #endregion

        #region Post Actualizar Datos
        [HttpPost]
        public ActionResult ActualizarDatos(Socio model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AD_Actualizar.ActualizarDatosSocios(model);
                if (resultado)
                {
                    return RedirectToAction("ListadoSocio", "Socio");
                }
                else
                {
                    return View(model);
                }
            }

            return View();


        }
        #endregion


        #region Get Eliminar Socio
        public ActionResult Eliminar(int idSocio)
        {
            Socio resultado = AD_Actualizar.ObtenerSocio(idSocio);

            return View(resultado);
        }
        #endregion

        #region Post Eliminar Socio
        [HttpPost]
        public ActionResult Eliminar(Socio model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AD_Eliminar.EliminarSocio(model);
                if (resultado)
                {
                    return RedirectToAction("ListadoSocio", "Socio");
                }
                else
                {
                    return View(model);
                }
            }

            return View();
        }
        #endregion
    }
}