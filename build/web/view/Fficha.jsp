<%-- 
    Document   : Fficha
    Created on : 15/05/2023, 6:42:23 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page import="model.Programa"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   <h1>Hello World!</h1>
 
       <div class="container">    
            <div class col-lg-6">
                <form action="ControladorFicha">
                <label for="codficha">codigo ficha</label>
                <input type="number" id="codficha" name="txtcodigo">

                <br>
                 <label for="cantiaprendices">cantidad de aprendices</label>
                <input type="text" id="cantiaprendices" name="txtcanti">
                
      
                 <br>

                     
                
                <label>Nombre programa</label> 
                
                
             
                <select name="listapro" class="custom-select">
                    <option value="0"></option> 
                    <%ProgramaDao pro=new ProgramaDao(); 
                    List<Programa> lista = pro.listadopro(); 
                    %>
                    <% for(Programa li:lista){  %> 
                    <option value="<%=li.getCodprograma()%>"><%=li.getNomprograma()%></option> 
                    <%}%>
                    
                    
                    
                  
                    
                    
                </select> 
                    
                        <br>
                         <label>Lista</label>  
                         
                    
                      <select name="listapro" class="custom-select"> 
                 

                    <option value="0"></option> 
                    <%AprendizDao adao=new AprendizDao(); 
                    List<Aprendiz> list = adao.listadoA(); 
                    %>
                    <% for(Aprendiz li:list){  %> 
                    <option value="<%=li.getNombrea()%>"><%=li.getDocu()%></option> 
                    <%}%>
                    
                
                                </select> 

                
                
                <input class="btn-btn-primary" type="submit" name="accion" value="Agregarficha">
                

               

               </form>
            </div>
                </body> 
</html>
