# ** ${{values.artifact_id}}**
{%- if values.description %}
description: ${{values.description | dump}}
{%- endif %}

### ** Documentação técnica**
Veja a documentação detalhada em: http://localhost:3000/docs/default/Component/${{values.artifact_id}}
