using AgenciaMetereologica.Acceso_Datos;
using AgenciaMetereologica.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace AgenciaMetereologica.Controllers
{
    public class MedicionesController : Controller
    {
        #region Get Alta Medicion
        public ActionResult AltaMedicion()
        {
            List<VM_Estaciones> listaEstaciones = AD_Listar.ListadoEstaciones();

            List<SelectListItem> ListItemEstaciones = listaEstaciones.ConvertAll(d =>
            {
                return new SelectListItem()
                {
                    Text = d.nombreEstacion,
                    Value = d.idEstacion.ToString(),
                    Selected = false
                };
            });

            ViewBag.itemsEstaciones = ListItemEstaciones;


         
            return View();
        }

        #endregion


        #region Post Alta Medicion
        [HttpPost]
        public ActionResult AltaMedicion(Mediciones model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AD_Alta.InsertarNuevaMedicion(model);
                if (resultado)
                {
                    return RedirectToAction("ListadoMediciones", "Mediciones");
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

        #region Get Lista de Mediciones
        public ActionResult ListadoMediciones()
        {
            List<Mediciones> lista = AD_Listar.ListadoMediciones();
            return View(lista);
        }
        #endregion

        #region Get Promedio de Temperatura y Humedad
        public ActionResult PromedioTemp_Humedad()
        {

            List<Temp_HumedadPromedio> resultado = AD_Reporte.ObtenerTemp_HumedadPromedio();

            return View(resultado);
        }
        #endregion


        #region Get Reporte maxima temperatura
        public ActionResult Reporte()
        {

            List<MaximaTemperatura> resultado = AD_Reporte.ObtenerMaximaTemperatura();

            return View(resultado);
        }
        #endregion
    }
}