<?xml version='1.0' encoding='ISO-8859-1' ?>
<!DOCTYPE helpset PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 1.0//EN""http://java.sun.com/products/javahelp/helpset_1_0.dtd">

<helpset version="1.0">

 <!−− title −−>
 <title>Ayuda para la aplicacion Reservas</title>

 <!−− maps −−>
 <maps>
 <homeID>aplicacion</homeID>
 <mapref location="map_file.jhm"/>
 </maps>

 <!−− Tabla de contenidos −−>
 <view>
 <name>Tabla de contenido</name>
 <label>Tabla de contenidos</label>
 <type>javax.help.TOCView</type>
 <data>toc.xml</data>
 </view>

 <!−− Indice −−>
 <view xml:lang="es">
 <name>Indice</name>
 <label>Indice</label>
 <type>javax.help.IndexView</type>
 <data>indice.xml</data>
 </view>

 <!−− Indice −−>
 <view xml:lang="es">
 <name>Buscar</name>
 <label>Buscar</label>
 <type>javax.help.SearchView</type>
 <data engine="com.sun.java.help.search.DefaultSearchEngine">
 JavaHelpSearch
 </data>
 </view>



</helpset>
