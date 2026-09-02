#include <iostream>
#include <vector>
#include <string>
#include <utility>
using namespace std;

enum class HttpStatus {
OK = 200,
Created = 201,
BadRequest = 400,
Unauthorized = 401,
NotFound = 404,
ServerError = 500
};

using Header = pair<string, string>;
using HeaderList = vector<Header>;
using Port = unsigned int;
using IPAddress = string;

typedef unsigned long long RequestId;

// Part A - Handle HTTP Response
void handleResponse(HttpStatus status, const string& endpoint) {
switch (static_cast<int>(status)) {
    case 200:
        cout << "[" << endpoint << "] -> " << static_cast<int>(status) << " OK : Request successful" << endl;
        break;

    case 201:
        cout << "[" << endpoint << "] -> " << static_cast<int>(status) << " Created : Resource created" << endl;
        break;

    case 400:
        cout << "[" << endpoint << "] -> " << static_cast<int>(status) << " Bad Request : Invalid request" << endl;
        break;

    case 401:
        cout << "[" << endpoint << "] -> " << static_cast<int>(status) << " Unauthorized : Authentication required" << endl;
        break;

    case 404:
        cout << "[" << endpoint << "] -> " << static_cast<int>(status) << " Not Found : Endpoint does not exist" << endl;
        break;

    case 500:
        cout << "[" << endpoint << "] -> " << static_cast<int>(status) << " Server Error : Internal server error - retry later" << endl;
        break;
}

}

void printHeaders(const HeaderList& headers) {
for (const Header& header : headers) {
cout << header.first << " : " << header.second << endl;
}
}

int main() {
handleResponse(HttpStatus::OK, "GET /api/users");
handleResponse(HttpStatus::Unauthorized, "POST /api/login");
handleResponse(HttpStatus::NotFound, "GET /api/products/99");
handleResponse(HttpStatus::ServerError, "POST /api/order");

HeaderList headers = {
    {"Content-Type", "application/json"},
    {"Authorization", "Bearer eyJhbGci..."},
    {"Accept-Language", "en-US"}
};

Port serverPort = 8080;
IPAddress ip = "192.168.1.10";
RequestId requestId = 1748293847;

cout << "Request ID : " << requestId << endl;
cout << "Server Port : " << serverPort << endl;
cout << "Headers:" << endl;

printHeaders(headers);

return 0;

}
