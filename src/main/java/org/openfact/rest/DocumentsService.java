package org.openfact.rest;

import io.swagger.annotations.*;
import org.openfact.rest.idm.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@SwaggerDefinition(
        securityDefinition = @SecurityDefinition(
                apiKeyAuthDefinitions = {
                        @ApiKeyAuthDefinition(key = "keycloak", name = "Authorization", in = ApiKeyAuthDefinition.ApiKeyLocation.HEADER)
                }
        )
)

@Path("/admin/organizations")
@Api(
        value = "/admin/organizations",
        description = "Comprobantes de pago", tags = "comprobantes",
        authorizations = {
                @Authorization(value = "keycloak", scopes = {})
        }
)
@Consumes(MediaType.APPLICATION_JSON)
public interface DocumentsService {

    @GET
    @Path("/{organization}/documents/{id}")
    @ApiOperation(value = "Obtener comprobante",
            notes = "Retorna un comprobante de pago",
            response = DocumentResponseRepresentation.class
    )
    @Produces(MediaType.APPLICATION_JSON)
    DocumentResponseRepresentation getDocumentById(
            @PathParam("organization") String organization,
            @PathParam("id") String id
    );

//    @GET
//    @Path("/{organization}/documents/{id}/representation/xml")
//    @Produces(MediaType.APPLICATION_JSON)
//    Response getXml(
//            @PathParam("organization") String organization,
//            @PathParam("id") String id
//    );
//
//    @GET
//    @Path("/{organization}/documents/{id}/report")
//    @Produces(MediaType.APPLICATION_JSON)
//    Response getPdf(
//            @PathParam("organization") String organization,
//            @PathParam("id") String id
//    );
//
//    @POST
//    @Path("/{organization}/documents/{id}/send-to-third-party")
//    @Produces(MediaType.APPLICATION_JSON)
//    Response sendToThirdParty(
//            @PathParam("organization") String organization,
//            @PathParam("id") String id
//    );
//
//    @POST
//    @Path("/{organization}/documents/{id}/send-to-third-party-by-email")
//    @Produces(MediaType.APPLICATION_JSON)
//    Response sendToCustomThirdParty(
//            @PathParam("organization") String organization,
//            @PathParam("id") String id,
//            ThirdPartyEmail thirdParty
//    );
//
//    @POST
//    @Path("/{organization}/documents/search")
//    @Produces(MediaType.APPLICATION_JSON)
//    Response search(
//            @PathParam("organization") String organization,
//            SearchCriteriaRepresentation criteria
//    );


    @GET
    @Path("/{organization}/sunat/documents/{id}/cdr")
    @Produces(MediaType.APPLICATION_JSON)
    Response getCdr(
            @PathParam("organization") String organization,
            @PathParam("id") String id
    );

//    @GET
//    @Path("/{organization}/sunat/documents/{id}/check-ticket")
//    @Produces(MediaType.APPLICATION_JSON)
//    Response checkTicket(
//            @PathParam("organization") String organization,
//            @PathParam("id") String id
//    );

    @POST
    @Path("/{organization}/sunat/documents/invoices")
    @ApiOperation(value = "Crear boleta/factura",
            notes = "Crea una boleta/factura y retorna el comprobante creado",
            response = DocumentResponseRepresentation.class
    )
    @Produces(MediaType.APPLICATION_JSON)
    DocumentResponseRepresentation createInvoice(
            @ApiParam(value = "Nombre de la organización", example = "miempresa")
            @PathParam("organization") String organization,

            @ApiParam(value = "Tipo de operación", defaultValue = "true")
            @QueryParam("async") boolean async,

            @ApiParam(value = "Cuerpo del comprobante", required = true) Invoice invoice
    );

    @POST
    @Path("/{organization}/sunat/documents/credit-notes")
    @ApiOperation(value = "Crear Nota de Crédito",
            notes = "Crea una Nota de Crédito y retorna el comprobante creado",
            response = DocumentResponseRepresentation.class
    )
    @Produces(MediaType.APPLICATION_JSON)
    DocumentResponseRepresentation createCreditNote(
            @ApiParam(value = "Nombre de la organización", example = "miempresa")
            @PathParam("organization") String organization,

            @ApiParam(value = "Tipo de operación", defaultValue = "true")
            @QueryParam("async") boolean async,

            @ApiParam(value = "Cuerpo del comprobante", required = true) CreditNote creditNote
    );

    @POST
    @Path("/{organization}/sunat/documents/debit-notes")
    @ApiOperation(value = "Crear Nota de Débito",
            notes = "Crea una Nota de Débito y retorna el comprobante creado",
            response = DocumentResponseRepresentation.class
    )
    @Produces(MediaType.APPLICATION_JSON)
    DocumentResponseRepresentation createDebitNote(
            @ApiParam(value = "Nombre de la organización", example = "miempresa")
            @PathParam("organization") String organization,

            @ApiParam(value = "Tipo de operación", defaultValue = "true")
            @QueryParam("async") boolean async,

            @ApiParam(value = "Cuerpo del comprobante", required = true) DebitNote debitNote
    );

    @POST
    @Path("/{organization}/sunat/documents/perceptions")
    @ApiOperation(value = "Crear Percepción",
            notes = "Crea una Percepción y retorna el comprobante creado",
            response = DocumentResponseRepresentation.class
    )
    @Produces(MediaType.APPLICATION_JSON)
    DocumentResponseRepresentation createPerception(
            @ApiParam(value = "Nombre de la organización", example = "miempresa")
            @PathParam("organization") String organization,

            @ApiParam(value = "Tipo de operación", defaultValue = "true")
            @QueryParam("async") boolean async,

            @ApiParam(value = "Cuerpo del comprobante", required = true) Perception perception
    );

    @POST
    @Path("/{organization}/sunat/documents/retentions")
    @ApiOperation(value = "Crear Retención",
            notes = "Crea una Retención y retorna el comprobante creado",
            response = DocumentResponseRepresentation.class
    )
    @Produces(MediaType.APPLICATION_JSON)
    DocumentResponseRepresentation createRetention(
            @ApiParam(value = "Nombre de la organización", example = "miempresa")
            @PathParam("organization") String organization,

            @ApiParam(value = "Tipo de operación", defaultValue = "true")
            @QueryParam("async") boolean async,

            @ApiParam(value = "Cuerpo del comprobante", required = true) Retention retention
    );

    @POST
    @Path("/{organization}/sunat/documents/voided-documents")
    @ApiOperation(value = "Crear VoidedDocument",
            notes = "Crea una VoidedDocument y retorna el comprobante creado",
            response = DocumentResponseRepresentation.class
    )
    @Produces(MediaType.APPLICATION_JSON)
    DocumentResponseRepresentation createVoidedDocument(
            @ApiParam(value = "Nombre de la organización", example = "miempresa")
            @PathParam("organization") String organization,

            @ApiParam(value = "Tipo de operación", defaultValue = "true")
            @QueryParam("async") boolean async,

            @ApiParam(value = "Cuerpo del comprobante", required = true) VoidedDocument voidedDocument
    );
}
