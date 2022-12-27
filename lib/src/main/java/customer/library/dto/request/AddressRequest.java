package customer.library.dto.request;

public record AddressRequest(

    String street,
    String streetNumber,
    String town
) {
}
