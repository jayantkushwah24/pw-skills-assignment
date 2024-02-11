
function downloader(url,cb){
    setTimeout( cb ,4000)
   
}

function writeFile(data , cb){
    setTimeout(cb,2000)
    
}

function uploadFile(fileName, newUrl, cb){
    setTimeout(cb,3000)
}

downloader("www.example.com",() => {

    writeFile("file.txt",() => {

        uploadFile("file.txt" , "http://www.example.", () => console.log("File has been uploaded"))


        console.log("File has been saved")
    }) 

    console.log("File has been downloaded")
});


