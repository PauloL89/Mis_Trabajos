using FinalProgramacionIII.Acceso_Dato;
using FinalProgramacionIII.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace FinalProgramacionIII.Controllers
{
    public class ExamenController : Controller
    {
        #region Get Alta de Examen
        public ActionResult AltaExamen()
        {
            List<VM_materia> listaMateria = AD_Listar.ListadoMateria();

            List<SelectListItem> ListItemMateria = listaMateria.ConvertAll(d =>
            {
                return new SelectListItem()
                {
                    Text = d.nombreMateria,
                    Value = d.idMateria.ToString(),
                    Selected = false
                };
            });

            ViewBag.itemsMateria = ListItemMateria;


            

            return View();
        }

        #endregion

        #region Post Alta de Examen
        [HttpPost]
        public ActionResult AltaExamen(Examen model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AD_Alta.InsertarNuevoExamen(model);
                if (resultado)
                {
                    return RedirectToAction("ListadoExamen", "Examen");
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

        #region Get Lista de Examen
        public ActionResult ListadoExamen()
        {
            List<Examen> lista = AD_Listar.ListadoExamen();
            return View(lista);
        }
        #endregion

        #region Get Lista de Notas
        public ActionResult ListadoNotas()
        {
            List<ListaNota> lista = AD_Listar.ListadoNota();
            return View(lista);
        }
        #endregion


        #region Get Promedio
        public ActionResult Promedio()
        {

            List<Promedio> resultado = AD_Promedio.ObtenerPromedio();

            return View(resultado);
        }
        #endregion


    }
}