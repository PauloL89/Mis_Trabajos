using Personas.AccesoDeDato;
using Personas.Models;
using Personas.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Personas.Controllers
{
    public class PersonaController : Controller
    {
        // GET: Persona
        #region Get AltaPersona
        public ActionResult AltaPersona()
        {
            List<SexoItemVM> listaSexos = AD_personas.ObtenerListaSexo();

            List<SelectListItem> items = listaSexos.ConvertAll( d => 
            {
                return new SelectListItem()
                {
                    Text = d.Nombre,
                    Value = d.IdSexo.ToString(),
                    Selected = false
                };
            });

            ViewBag.items = items; 

            return View();
        }
        #endregion

        #region Get ListaPersona
        public ActionResult ListaPersonas()
        {
            List<Persona> lista = AD_personas.ObtenerListaPersona();
            return View(lista);
        }
        #endregion

        #region Get EliminarPersona
        public ActionResult EliminarPersona(int idPersona)
        {
            Persona resultado = AD_personas.ObtenerPersona(idPersona);
            
            return View(resultado);
        }
        #endregion

        #region Post EliminarPersona
        [HttpPost]
        public ActionResult EliminarPersona(Persona model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AD_personas.EliminarPersona(model);
                if (resultado)
                {
                    return RedirectToAction("ListaPersonas", "Persona");
                }
                else
                {
                    return View(model);
                }
            }

            return View();
        }
        #endregion

        #region Get DatosPersona
        public ActionResult DatosPersona(int idPersona)
        {

            List<SexoItemVM> listaSexos = AD_personas.ObtenerListaSexo();

            List<SelectListItem> itemCombo = listaSexos.ConvertAll(d =>
            {
                return new SelectListItem()
                {
                    Text = d.Nombre,
                    Value = d.IdSexo.ToString(),
                    Selected = false
                };
            });


            Persona resultado = AD_personas.ObtenerPersona(idPersona);

            foreach (var item in itemCombo)
            {
                if (item.Value.Equals(resultado.IdSexo.ToString()))
                {
                    item.Selected = true;
                    break;
                }
            }
            ViewBag.items = itemCombo;

            ViewBag.nombre = resultado.Nombre + " " + resultado.Apellido;
            return View(resultado);
        }
        #endregion

        #region Post DatosPersona
        [HttpPost]
        public ActionResult DatosPersona(Persona model)
        {
            if (ModelState.IsValid)
            {
               bool resultado = AD_personas.ActualizarDatosPersona(model);
                if (resultado) 
                {
                    return RedirectToAction("ListaPersonas", "Persona");
                }
                else 
                {
                    return View(model);
                }
            }
            
             return View( );
            
           
        }
        #endregion

        #region Post AltaPersona
        [HttpPost] // para enviar datos a la base de datos
        public ActionResult AltaPersona(Persona model)
        {
            if (ModelState.IsValid)
            {
                bool resultado = AD_personas.InsertarNuevaPersona(model);//llamada al metodo inertar persona
                if (resultado)
                {
                   return RedirectToAction("ListaPersonas","Persona");
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
    }
}