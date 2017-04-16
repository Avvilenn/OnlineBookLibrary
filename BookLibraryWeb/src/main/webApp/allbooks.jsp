<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="library">
    <meta name="author" content="me">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Search book </title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="cover.css" rel="stylesheet">
     <script type="text/javascript" src="http://gc.kis.v2.scr.kaspersky-labs.com/02DCC049-F923-2A47-AA9C-3C7214D5AB18/main.js" charset="UTF-8"></script><script src="../../assets/js/ie-emulation-modes-warning.js"></script>
</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                       <nav>
                        <ul class="nav masthead-nav">
                            <li class="active"><a href="index.html"> homepage</a></li>
                            <li class="active"><a href="searchbook.jsp"> search book</a></li>
                            <li class="active"><a href="addbook.jsp"> add book </a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">
            <h2 class="cover-heading">Results of searching: </h2>

            <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>BOOK</th>
                                    <th>Description</th>
                                    <th><span class="glyphicon glyphicon-download" aria-hidden="true">Download</span></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="book" items="${bookList}" varStatus="status">
                                    <c:url var="download" value="download">
                                        <c:param name="isbn" value="${book.isbn}"/>
                                    </c:url>

                                        <td>${book.title} <br> ${book.author} <br> <img src="${book.coverImage}" alt="bookcover" class="img-rounded"></td>
                                        <td>${book.description}</td>
                                        <td><a href="${download}"><span class="glyphicon glyphicon-download" aria-hidden="true"></span></a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
            </table>
            </div>



            <div class="mastfoot">
                <div class="inner">
                    <p>online book library</p>
                </div>
            </div>

        </div>

    </div>

</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="../../dist/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>