using Personas.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Personas.Controllers
{
    public class UsuarioController : Controller
    {
        // GET: Usuario
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Login()
        {
            return View();
        }

        [HttpPost] // para enviar datos al servidor
        public ActionResult Login(Usuario modelo)
        {
            if (ModelState.IsValid) 
            {
                return RedirectToAction("Principal", "Home");
            }
            else 
            {
                return View(modelo);
            }
            
        }
    }
}