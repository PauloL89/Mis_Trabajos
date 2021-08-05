using DisneyApi.Contex;
using DisneyApi.DTOs;
using DisneyApi.Entities;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;



namespace DisneyApi.Controllers
{
    [Route("/characters")]
    [ApiController]
    public class CharacterController : ControllerBase
    {
        private readonly AppDbContext contex;

        public CharacterController(AppDbContext contex)
        {
            this.contex = contex;
        }

        //LISTAR
        [HttpGet]
        public IActionResult GetCharacterList() 
        {
            var characterList = contex.Character.ToList();
            var dtoList = new List<CharacterList_dto>();
            foreach (var item in characterList)
            {
                var dto = new CharacterList_dto
                {
                    Nombre = item.nombre,
                    Imagen = item.imagen
                };
                dtoList.Add(dto);
            }

            return Ok(dtoList);
        }

        //LISTAR POR ID
        [HttpGet("{id}")]
        public Character Get(int id)
        {
            var character = contex.Character.FirstOrDefault(p => p.id == id);
            return character;
        }

        //Busqueda por nombre
        [HttpGet]
        [Route("/characters/byName")]
        public IActionResult GetCharacterByName(string name) 
        {
            var charactersByName = contex.Character.ToList();
            if(name == null) 
            {
                charactersByName = contex.Character.ToList();
            }
            else 
            {
                charactersByName = contex.Character.Where(x => x.nombre == name).ToList();
            }
            return Ok(charactersByName);
        }


        //LISTAR DETALLES
        [HttpGet]
        [Route("/characters/details")]
        public IEnumerable<Character> Get()
        {
            return contex.Character.ToList();
        }

        // ALTA
        [HttpPost]
        public ActionResult Post([FromBody] Character character)
        {
            try
            {
                contex.Character.Add(character);
                contex.SaveChanges();
                return Ok();
            }
            catch (Exception exep)
            {
                return BadRequest();
                //throw;
            }
        }

        // UPDATE
        [HttpPut("{id}")]
        public ActionResult Put(int id, [FromBody] Character character)
        {
            if (character.id == id)
            {
                contex.Entry(character).State = EntityState.Modified;
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
            var personaje = contex.Character.FirstOrDefault(p => p.id == id);

            if (personaje != null)
            {
                contex.Character.Remove(personaje);
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
