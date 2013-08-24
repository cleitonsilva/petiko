modules = {
    application {
        resource url:'js/application.js'
    }
    
    bootstrap{
        dependsOn 'jquery'
        resource id: 'css', url: [dir: 'bootstrap/css/', file: "bootstrap.css"]
        resource id: 'js', url: [dir: 'bootstrap/js/', file: "bootstrap.js"]
        resource id: 'fonts', url: [dir: 'bootstrap/fonts/', file: "glyphicons-halflings-regular.ttf"]
    }
}