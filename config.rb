require 'govuk_tech_docs'

GovukTechDocs.configure(self)

set :relative_links, true
activate :relative_assets

activate :content_security_policy do |policy|
  policy.script_src :self,
                    "http://localhost:12345",
                    "/tracking-consent"
end