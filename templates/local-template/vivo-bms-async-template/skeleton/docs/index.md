### **HISTÓRICO DE ELABORAÇÃO**
|   **Data**   | **Versão**   |            **Autor**            | **Descrição da Alteração** |
|:------------:|:------------:|:-------------------------------:|:--------------------------:|
| _dd/mm/yyyy_ | _01_         |           _backstage_           | _Criação do documento_     |
--- 

### **1 Contexto**
TODO

### **2 Escopo**
TODO

### **3 Componentes**
TODO

### **4. Swagger**
TODO
http://localhost:3000/catalog/default/api/assinaturas-api-v4-api

### 5 Operações
TODO

### **6 Fluxos de erros**
TODO

### **7. Adapters**
TODO





#### **X.Y - Binary-encoded Avro**
Messages on a Kafka topic are being produced using a GenericDatumWriter with binary encoding.

##### How this could be described in AsyncAPI
```yaml
asyncapi: "2.0.0"
  ...
      schemaFormat: "application/vnd.apache.avro;version=1.9.0"
      contentType: "application/json"
  ...
```

#### **X.Y - JSON-encoded Avro**
Messages on a Kafka topic were produced using a GenericDatumWriter with JSON encoding.

##### How this could be described in AsyncAPI
```yaml
asyncapi: "2.0.0"
  ...
      schemaFormat: "application/vnd.apache.avro;version=1.9.0"
      contentType: "application/octet-stream"
  ...
```
