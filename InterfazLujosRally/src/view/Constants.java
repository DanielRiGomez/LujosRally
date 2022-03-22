package view;

import java.awt.Color;
import java.awt.Font;

public class Constants {

	public static final String[] HEADER_AVAILABLE = { "Código Libro", "ISBN", "Titulo Libro", "Nombre Autor",
			"Category", "Lenguaje", "Editorial", "Número de paginas" };

	public static final String TEXT_WINDOW = "Lujos Rally Yopal";
	public static final String TEXT_REGISTER = "<html><center>Bienvenido al registro de usuario de <br> Lujos Rally<html>";
	public static final String TEXT_CONDITION = "<html><justify>Ingrese los datos solicitados,recuerte que el símbolo (*) asterisco <br> corresponde a campos obligatorios.</html>";
	public static final String TEXT_USER_NAME = "Nombre del usuario (*)";
	public static final String TEXT_USER_EMAIL = "Correo ";
	public static final String TEXT_USER_PASSWORD = "Contraseña (*)";
	public static final String TEXT_USER_CON_PASSWORD = "Confirmar contraseña (*) ";
	public static final String TEXT_SUCESS = "<html><center>¡Su registro se ha realizado de <br> forma exitosa! </html>";

	public static final String BUTTON_LOG_USER = "Ingresar";
	public static final String BUTTON_REGISTER_USER = "Registrarse";
	public static final String BUTTON_REGISTER_USER2 = "Registrar";
	public static final String BUTTON_RETURN = "Volver";

	public static final String BUTTON_START = "Inicio                              ";
	public static final String BUTTON_REG_PRODUCT = "Registrar Producto       ";
	public static final String BUTTON_SEL_PRODUCT = "Venta de producto        ";
	public static final String BUTTON_SHO_INVENTA = "Ver inventario               ";
	public static final String BUTTON_SHO_SELLS = "Ver ventas                     ";

	public static final String ICON_LOGIN = "/img/logo.png";
	public static final String ICON_FOND = "/img/fondo.jpg";
	public static final String ICON_LOGCAR = "/img/LogoCar.png";
	public static final String ICON_REGIS = "/img/editar.png";
	public static final String ICON_INVENT = "/img/equipaje.png";
	public static final String ICON_SELL = "/img/hucha.png";
	public static final String ICON_START = "/img/inicio.png";
	public static final String ICON_MONEY = "/img/moneda.png";
	public static final String ICON_CAPT = "/img/captura.jpg";

	public static final Color COLOR_WHITE = Color.decode("#FFFFFF");
	public static final Color COLOR_BLACK = Color.decode("#121212");
	public static final Color COLOR_BLUE_LOG = Color.decode("#A0B9D1");
	public static final Color COLOR_RED = Color.decode("#c52043");
	public static final Color COLOR_BLUE_PANEL = new Color(65, 113, 162, 200);
	public static final Color COLOR_BLUE_PANEL2 = new Color(65, 113, 162, 10);

	public static final Font FONT_NUNITO = new Font("Sarabun", Font.BOLD, 25);
	public static final Font FONT_NUNITO_PLAIN = new Font("Sarabun", Font.PLAIN, 25);
	public static final Font FONT_NUNITO_BOLD = new Font("Sarabun", Font.BOLD, 35);
	public static final Font FONT_NUNITO_TEXT = new Font("Nunito", Font.ITALIC, 15);
}