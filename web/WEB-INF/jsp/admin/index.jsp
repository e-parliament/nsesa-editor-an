<%--

    Copyright 2013 European Parliament

    Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
    You may not use this work except in compliance with the Licence.
    You may obtain a copy of the Licence at:

    http://joinup.ec.europa.eu/software/page/eupl

    Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the Licence for the specific language governing permissions and limitations under the Licence.

--%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<div class="panel panel-default">
    <div class="panel-heading">
        <h2 class="panel-title">Documents</h2>
    </div>
    <div class="panel-body">
        <table id="documents" class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Deadline</th>
                <th>Amendable</th>
                <th>Language</th>
            </tr>
            </thead>
            <tbody>

            </tbody>

        </table>
    </div>
</div>

<div class="panel panel-default">
    <div class="panel-heading">
        <h2 class="panel-title">Groups</h2>
    </div>
    <div class="panel-body">
        <table id="groups" class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
            </thead>
            <tbody>

            </tbody>

        </table>
    </div>
</div>

<div class="panel panel-default">
    <div class="panel-heading">
        <h2 class="panel-title">Users</h2>
    </div>
    <div class="panel-body">
        <table id="users" class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
            </thead>
            <tbody>

            </tbody>

        </table>
    </div>
</div>

<div class="panel panel-default">
    <div class="panel-heading">
        <h2 class="panel-title">Amendments</h2>
    </div>
    <div class="panel-body">
        <table id="amendments" class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Deadline</th>
                <th>Amendable</th>
                <th>Language</th>
            </tr>
            </thead>
            <tbody>

            </tbody>

        </table>
    </div>
</div>

<script language="JavaScript">
    $.ajax({
        url:"/services/ws/rest/document/all"
    }).done(function(data) {
        var source   = $("#document-template").html();
        var template = Handlebars.compile(source);
        $.each(data, function(i, doc) {
            var context = {document:doc, deadline: new Date(doc.deadline)};
            var html    = template(context);
            $('#documents tbody').append(html);
        });
    });
</script>
<script id="document-template" type="text/x-handlebars-template">
    <tr>
        <td>{{document.documentID}}</td>
        <td>{{document.name}}</td>
        <td>{{deadline}}</td>
        <td>{{document.amendable}}</td>
        <td>{{document.languageIso}}</td>
    </tr>
</script>
</body>
</html>




