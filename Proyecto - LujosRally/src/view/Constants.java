package view;

import java.awt.Color;
import java.awt.Font;

public class Constants {

	public static final String[] TABLE_PRODUCTS = { "Código Producto", "Nombre Producto", "Tipo de Carro", "Marca",
			"Referencias", "Características", "Descripción", "Unidades en Stock", "Valor Unidad" };
	public static final String[] TABLE_SELLS = {"Nombre Producto", "Fecha de venta",
			"Unidades vendidas", "Valor de la venta", "Código del producto" };

	public static final String TEXT_WINDOW = "Lujos Rally Yopal";
	public static final String TEXT_REGISTER = "<html><center>Bienvenido al registro de usuario de <br> Lujos Rally<html>";
	public static final String TEXT_REGISTER_SELL = "<html><center>Registrar ventas<html>";
	public static final String TEXT_CONDITION = "<html><justify>El símbolo (*) asterisco corresponde a campos obligatorios.</html>";
	public static final String TEXT_USER_NAME = "Nombre del usuario (*)";
	public static final String TEXT_USER_EMAIL = "Correo ";
	public static final String TEXT_USER_PASSWORD = "Contraseña (*)";
	public static final String TEXT_USER_CON_PASSWORD = "Confirmar contraseña (*) ";
	public static final String TEXT_PRODUCT_NAME = "Nombre del producto (*)";
	public static final String TEXT_PRODUCT_TYPE_CAR = "<html><justify>Seleccione el tipo de carro<br> al que pertenece</html> ";
	public static final String TEXT_PRODUCT_MARK = "<html><justify>Seleccione la marca del<br> producto </html> ";
	public static final String TEXT_PRODUCT_REFERENCE = "Referencia";
	public static final String TEXT_PRODUCT_DESCRIPTION = "Descripción";
	public static final String TEXT_PRODUCT_FEATURE = "Características adicionales";
	public static final String TEXT_UNITS = "Unidades (*)";
	public static final String TEXT_PRICE = "Precio (*)";
	public static final String TEXT_SUCESS = "<html><center>Su registro se ha realizado de <br> forma exitosa! </html>";
	public static final String TEXT_SELL_DATE = "Fecha de venta:    ";
	public static final String TEXT_SELL_ID = "Identificación del producto(*)";
	public static final String TEXT_SELL_UNIT = "Unidades vendidas (*)";
	public static final String TEXT_SELL_NAME = "Nombre del producto";
	public static final String TEXT_SELL_total = "Precio total (*)";
	public static final String TEXT_EDI_INFOR = "Editar información";

	public static final String TEXT_REGISTER_PRODUCT_TITLE = "Registro de producto";
	public static final String TEXT_REGISTER_NAME_PRODUCT = "Ingrese nombre del producto";
	public static final String TEXT_REGISTER_NUMBER_PRODUCT = "Ingrese valores némericos";
	public static final String TEXT_REGISTER_TYPE_CAR = "Seleccione el tipo de carro";
	public static final String TEXT_REGISTER_TEXT = "Ingrese un texto";

	public static final String TEXT_EDI_NAME = "Editar Nombre del producto";
	public static final String TEXT_EDI_UNIT = "Editar Unidades del producto";
	public static final String TEXT_EDI_PRICE = "Editar Precio del producto";
	public static final String TEXT_EDI_TYCAR = "Editar Tipo de carro del producto";
	public static final String TEXT_EDI_MARC = "Editar Marca del producto";
	public static final String TEXT_EDI_REF = "Editar Referencia del producto";
	public static final String TEXT_EDI_DESCR = "Editar Descripción del producto";
	public static final String TEXT_EDI_CHARAC = "Editar Características adicionales del producto";

	public static final String TEXT_SHOW_INVEN = "Ver tabla de inventario";
	public static final String TEXT_SHOW_TOTAL_PRICE = "Ver costo total de inventario";

	public static final String BUTTON_LOG_USER = "Ingresar";
	public static final String BUTTON_REGISTER_USER = "Registrarse";
	public static final String BUTTON_REGISTER_USER2 = "Registrar";
	public static final String BUTTON_REGISTER_SELL = "Registrar Venta";
	public static final String BUTTON_REGISTER_PRODUC = "Registrar Producto";
	public static final String BUTTON_RETURN_SELL = "Regresar";
	public static final String BUTTON_RETURN = "Volver";
	public static final String BUTTON_CLOSE = "Cerrar sesión                   ";

	public static final String BUTTON_ED_NAME = "Guardar Nombre";
	public static final String BUTTON_ED_QUAN = "Guardar Cantidad";
	public static final String BUTTON_ED_PRIC = "Guardar Precio";
	public static final String BUTTON_ED_TYPE = "Guardar Tipo";
	public static final String BUTTON_ED_MARC = "Guardar Marca";
	public static final String BUTTON_ED_REFE = "Guardar Referencia";
	public static final String BUTTON_ED_DESC = "Guardar descripcion";
	public static final String BUTTON_ED_CHAR = "Guardar Características";

	public static final String BUTTON_START = "Inicio                              ";
	public static final String BUTTON_REG_PRODUCT = "Registrar Producto       ";
	public static final String BUTTON_SEL_PRODUCT = "Venta de producto        ";
	public static final String BUTTON_SHO_INVENTA = "Ver inventario               ";
	public static final String BUTTON_SHO_SELLS = "Ver ventas                     ";
	public static final String BUTTON_EDI_INFOR = "Editar informaci�n         ";

	public static final String ICON_LOGIN = "/img/logo.png";
	public static final String ICON_FOND = "/img/fondo.jpg";
	public static final String ICON_LOGCAR = "/img/LogoCar.png";
	public static final String ICON_REGIS = "/img/editar.png";
	public static final String ICON_INVENT = "/img/equipaje.png";
	public static final String ICON_SELL = "/img/hucha.png";
	public static final String ICON_START = "/img/inicio.png";
	public static final String ICON_MONEY = "/img/moneda.png";
	public static final String ICON_EDIT = "/img/lapiz.png";
	public static final String ICON_CAPT = "/img/captura.PNG";
	public static final String ICON_EXIT = "/img/cerrar.png";

	public static final Color COLOR_WHITE = Color.decode("#FFFFFF");
	public static final Color COLOR_BLACK = Color.decode("#121212");
	public static final Color COLOR_BLUE_LOG = Color.decode("#A0B9D1");
	public static final Color COLOR_GRAY_LOG = Color.decode("#bfcad3");
	public static final Color COLOR_RED = Color.decode("#c52043");
	public static final Color COLOR_BLUE_BACKGROUND = Color.decode("#d8e5f5");
	public static final Color COLOR_BLUE_PANEL = new Color(65, 113, 162, 200);
	public static final Color COLOR_BLUE_PANEL2 = new Color(65, 113, 162, 10);

	public static final Font FONT_NUNITO = new Font("Sarabun", Font.BOLD, 25);
	public static final Font FONT_NUNITO_NORMAL = new Font("Sarabun", Font.BOLD, 10);
	public static final Font FONT_NUNITO_PLAIN = new Font("Sarabun", Font.PLAIN, 25);
	public static final Font FONT_NUNITO_BOLD = new Font("Sarabun", Font.BOLD, 35);
	public static final Font FONT_NUNITO_TEXT = new Font("Nunito", Font.ITALIC, 15);
}