using Lavadero_Ejercicio1_U4.AccedoDeDatos;
using Lavadero_Ejercicio1_U4.Models;
using Lavadero_Ejercicio1_U4.ViewModel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Lavadero_Ejercicio1_U4.Controllers
{
    public class LavaderoController : Controller
    {
        #region Get AltaLavados
        public ActionResult AltaLavado()
        {
            List<TipoItemVM> listaTipo = AccesoDato.ObtenerListaTipo();

            List<SelectListItem> items = listaTipo.ConvertAll(d =>
            {
                return new SelectListItem()
                {
                    Text = d.nombre,
                    Value = d.idTipo.ToString(),
                    Selected = false
                };
            });

            ViewBag.items = items;

            return View();
        }
        #endregion

        #region Post AltaLavados
        [HttpPost] // para enviar datos a la base de datos
        public ActionResult AltaLavado(Lavado model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AccesoDato.InsertarNuevoLavado(model);//llamada al metodo inertar persona
                if (resultado)
                {
                    return RedirectToAction("ListaLavado", "Lavadero");
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

        #region Get Lista de Lavados
        public ActionResult ListaLavado()
        {
            List<Lavado> lista = AccesoDato.ObtenerListaLavado();
            return View(lista);
        }
        #endregion

        #region Get Datos Ultimo taxi habitual
        public ActionResult Reporte()
        {

           Lavado resultado = AccesoDato.ObtenerTaxiHabitual();

            return View(resultado);
        }
        #endregion

        #region Get EliminarLavado
        public ActionResult EliminarLavado(int IdEliminarlavado)
        {
            Lavado resultado = AccesoDato.ObtenerLavado(IdEliminarlavado);

            return View(resultado);
        }
        #endregion


        #region Post EliminarLavado
        [HttpPost]
        public ActionResult EliminarLavado(Lavado model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AccesoDato.EliminarLavado(model);
                if (resultado)
                {
                    return RedirectToAction("ListaLavado", "Lavadero");
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