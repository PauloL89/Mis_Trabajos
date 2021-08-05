using DisneyApi.Entities;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DisneyApi.Contex
{
    public class AppDbContext:DbContext
    {
        public AppDbContext(DbContextOptions<AppDbContext> options) : base(options)
        {

        }

        public DbSet<Character> Character { get; set; }

        public DbSet<Movie> Movie { get; set; }

        public DbSet<Genre> Genre { get; set; }

        //public DbSet<MovieCharacter> MovieCharacter { get; set; }

        
    }
}
