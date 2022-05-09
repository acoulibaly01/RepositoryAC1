/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coulibaly.syslin;

/**
 *
 * @author Amadou Coulibaly
 */
public class Matrice {
    // Attributs
    int nbrLig;
    int nbrCol;
    double[][] coeffs;
    
    // Constructeur avec arguments
    Matrice(int nl, int nc)
    {
        this.nbrLig=nl;
        this.nbrCol=nc;
        this.coeffs=new double[nl][nc];
    }
    
    // Méthode identité 
    static Matrice identite(int n)
    {
        Matrice id=new Matrice(n,n);
        int i;
        for (i=0;i<n;i++)
        {id.coeffs[i][i]=1;
        }
        return id;
    }
    
    
    // Méthode matTest1
    static Matrice matTest1(int n)
    {
        Matrice m=new Matrice(n,n);
        double coeff=0;
        for (int i=0;i<n;i++)
        {for (int j=0;j<n;j++)
            {
           m.coeffs[i][j]=coeff;
           coeff=coeff+1; 
            }      
        }
        return m;
    }
    
    // Méthode matTest2
        static Matrice matTest2(int n)
    {
        Matrice m=matTest1(n);  
        for (int i=0;i<n;i++)
        {
           m.coeffs[i][i]=m.coeffs[i][i]*(-1);
        }
      return m;
    }
    
     // Méthode aleaUnOuDeux
     static Matrice aleaUnOuDeux(int nl, int nc)
    {
        Matrice m=new Matrice(nl,nc);
        int i,j;
        for (i=0;i<nl;i++)
        {
            for (j=0;j<nc;j++)
            {
                m.coeffs[i][j]= ((int)(Math.random()*10))%2+1;
            }
        }
        return m;
    }
        
    
          static Matrice matAleaZeroUnDeux(int nl, int nc, double pz)
    {
        Matrice m=new Matrice(nl,nc);
        int i,j;
        double p;
        for (i=0;i<nl;i++)
        {
            for (j=0;j<nc;j++)
            {
                p=Math.random();
                if (p<=pz)
                {
                    m.coeffs[i][j]=0.0;
                }
                if (p>pz)
                {
                m.coeffs[i][j]= ((int)(p*10))%2+1;
                }
            }
        }
        return m;
    }
         // Méthode creeVecteur
          static Matrice creeVecteur1(int nc)
          {
              System.out.println("Création de vecteur");
              Matrice v=new Matrice(1,nc);
              for (int i=0;i<nc;i++) 
              {v.coeffs[0][i]=i+1;
              }
              return(v);
          }
          
           // Méthode creeVecteur version TD
           static Matrice creeVecteur(int n)
          {
              System.out.println("Création de vecteur à partir d'un Tableau ");
              // déclaration et initialisation
              double [] v= new double[n]; 
              for (int i=0;i<n;i++) v[i]=i+1;
              Matrice m=new Matrice(n,1);
              for (int i=0;i<n;i++) 
              {m.coeffs[i][0]=v[i];
              }
              return(m);
          }
          
          // Methodes get et set
        int getnbrLig()
        {
            return(this.nbrLig);
        }
        void setnbrLig(int nl)
        {
            this.nbrLig=nl;
        }
        
                int getnbrCol()
        {
            return(this.nbrCol);
        }
        void setnbrCol(int nl)
        {
            this.nbrLig=nl;
        }
        
        
 }// Fin de la classe Matrice

