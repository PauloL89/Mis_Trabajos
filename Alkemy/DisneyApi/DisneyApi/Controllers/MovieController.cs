using DisneyApi.Contex;
using DisneyApi.DTOs;
using DisneyApi.Entities;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

// For more information on enabling Web API for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace DisneyApi.Controllers
{
    [Route("GET/movies")]
    [ApiController]
    public class MovieController : ControllerBase
    {
        private readonly AppDbContext contex;

        public MovieController(AppDbContext contex)
        {
            this.contex = contex;
        }

        
        //LISTAR
        [HttpGet]
        public IActionResult GetMovieList()
        {
            var movieList = contex.Movie.ToList();
            var dtoList = new List<MovieListDTO>();
            foreach (var item in movieList)
            {
                var dto = new MovieListDTO
                {
                    titulo = item.titulo,
                    imagen = item.imagen,
                    fechaCreacion = item.fechaCreacion
                };
                dtoList.Add(dto);
            }

            return Ok(dtoList);
        }

        
        // LISTAR POR ID
        [HttpGet("{id}")]
        public Movie Get(int id)
        {
            var movie = contex.Movie.FirstOrDefault(p => p.id == id);
            return movie;
        }


        //Busqueda por nombre
        [HttpGet]
        [Route("/GET/movies/byTitle")]
        public IActionResult GetCharacterByName(string name)
        {
            var movieByName = contex.Movie.ToList();
            if (name == null)
            {
                movieByName = contex.Movie.ToList();
            }
            else
            {
                movieByName = contex.Movie.Where(x => x.titulo == name).ToList();
            }
            return Ok(movieByName);
        }


        // LISTAR POR DETALLES
        [HttpGet]
        [Route("/GET/movies/details")]
        public IEnumerable<Movie> Get()
        {
            return contex.Movie.ToList();
        }


        //ALTA
        [HttpPost]
        public ActionResult Post([FromBody] Movie movie)
        {
            try
            {
                contex.Movie.Add(movie);
                contex.SaveChanges();
                return Ok();
            }
            catch (Exception e)
            {
                return BadRequest();
                //throw;
            }
        }

        //UPDATE
        [HttpPut("{id}")]
        public ActionResult Put(int id, [FromBody] Movie movie)
        {
            if (movie.id == id) 
            {
                contex.Entry(movie).State = EntityState.Modified;
                contex.SaveChanges();
                return Ok();
            }
            else 
            {
                return BadRequest();
            }
        }

        //DELETE
        [HttpDelete("{id}")]
        public ActionResult Delete(int id)
        {
            var pelicula = contex.Movie.FirstOrDefault(p => p.id == id);

            if (pelicula != null) 
            {
                contex.Movie.Remove(pelicula);
                contex.SaveChanges();
                return Ok();
            }
            else 
            {
                return BadRequest();
            }
        }
    }
}
