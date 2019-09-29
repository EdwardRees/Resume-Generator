const puppeteer = require("puppeteer");
const path = require("path");
const express = require("express");
const bodyParser = require("body-parser");

var app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.get("/", (req, res) => {
  res.sendFile(path.join(__dirname + "/public/index.html"));
});
app.use("/static", express.static("static"));

const PORT = process.env.PORT || 8082;
const server = app.listen(PORT, () => {
  console.log(`App listening on port ${PORT}!`);
});

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  await page.goto(`http://localhost:${PORT}`).then(res => {});
  await page.pdf({ path: "resume.pdf", format: "A4" });

  await browser.close();
  console.log("Done!");
})();

setTimeout(() => {
  server.close();
  console.log("Server off.");
}, 2000);
