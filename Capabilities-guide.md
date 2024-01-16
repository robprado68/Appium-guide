# Guía de Capacidades de Appium

## Introducción

Las Capacidades de Appium nos permiten configurar y personalizar el comportamiento del servidor Appium y del dispositivo móvil bajo prueba.

## Configuración de las Capacidades de Appium

Para configurar las capacidades de Appium, debe definirlas en su script de prueba o archivo de configuración de prueba. Estas capacidades proporcionan información sobre el dispositivo, la plataforma, la aplicación y otras configuraciones necesarias para la ejecución de la prueba.

A continuación se muestran algunas capacidades de Appium de uso común:

### Capabilities del Dispositivo

Algunas de las Capacidades más importantes son las siguientes:

- `platformName`: El nombre de la plataforma móvil (por ejemplo, Android, iOS).
- `platformVersion`: La versión de la plataforma móvil.
- `deviceName`: El nombre del dispositivo o emulador.
- `udid`: El identificador único del dispositivo (para dispositivos reales).
- `app`: La ruta o URL de la aplicación a probar.
- `appActivity`: Hace referencia a una actividad de la aplicacion

### Capabilites del Servidor de Appium

- `automationName`: El nombre de la tecnología de automatización a utilizar (por ejemplo, UiAutomator2, XCUITest).
- `appiumVersion`: La versión del servidor de Appium.
- `newCommandTimeout`: El tiempo máximo (en segundos) para esperar un nuevo comando del cliente.

## Example Usage

Este es un json con estas capabilities:

```Json
{
  "deviceName": "Galaxy A34 G",
  "udid": "RFCW4273XKK",
  "platformName": "Android",
  "platformVersion": "14",
  "app": "C:\\Users\\UserX\\Downloads\\Calculator.apk",
  "automationName": "UiAutomator2"
}
```

**Nota** Para mas informacion sobre las capabilites puede visitar el sitio oficial haciendo [click aqui](https://appium.io/docs/en/2.2/guides/caps/#:~:text=Capabilities%20are%20represented%20as%20key,session%20to%20your%20client%20library.)
