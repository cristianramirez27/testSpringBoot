FROM artifact.coppel.space/library/openjdk:17-jre-alpine
EXPOSE 8080
WORKDIR /sysx/progs
RUN mkdir ./logs
ENV FireBaseApi=eyJ0eXBlIjogInNlcnZpY2VfYWNjb3VudCIsInByb2plY3RfaWQiOiAiY3BsLWNvcnAtY2FwcGZiLWRldi0xNjA3MjAyNCIsInByaXZhdGVfa2V5X2lkIjogIjZhNmEyNzZiMGJkZTQzZWU0OTdiZWNjZTkyNDUwMDJjYjJhODg2YmMiLCJwcml2YXRlX2tleSI6ICItLS0tLUJFR0lOIFBSSVZBVEUgS0VZLS0tLS1cbk1JSUV2UUlCQURBTkJna3Foa2lHOXcwQkFRRUZBQVNDQktjd2dnU2pBZ0VBQW9JQkFRRGNKSWhGZzI3a3BFZnBcbkVTSzcxa1NtbzdvM3FIVUxrOFg2dHl5RDNXclJqd01ycG55OUVNRnVYODhCVXVRdENHYktYdXovVWZBOHEwSnFcbnJsUGg1OWEvNXdCd0N2eWVtVnc2QS9MWmJ2ek1yOWs3QjVSTGFGWGV3bTcxNjNtOVptaEZ1eWVjQkoyT0FXcWlcbmFpaHF6eFlTZlN1amRaUEVPaGRIdDRIZHpGVDVPOFZHeFF4SzJzTXhrektlYVJ0b1Y1c0V2dGFra2JQS25kQkRcbk43aVVZUzIxWndRU2orc3BQeW1tRDFjNFdaN081ZzJabHVqQkIyRmdQazZmNExVV2s1VXNad1pzZVJyQ25FNHlcbjY3ZC8vNlZpbnRtM1FYd3VSd0Y1L1pESTFpTmlGWHl0Wm5aZzBzbU5tNGVoS094VkoyTS9JZFFMRWlmd0ljMFFcbjcxMGVWUmU1QWdNQkFBRUNnZ0VBRFV6WnZOVnBoRC9XcG1LbUpoSVdlTGpvbmNjOE54UlpBRUpEMnIyc1gvZlRcbmViWW4wQ1pzZ1ZZaGhCTjFmTEVHd05CR1lsQ1pncGpZUE9qR1laNG5yOVZ0aGRkc0ZzcnVNd1VkRFh6eW9nMDNcbnd5UzhsV2U2MUdnTDJ5aThaTENFdVQzSzhWYW9ERFhTc3ZoVjg4b0tLOWpMSTZlTlkyd2REdlNyMEhJeGFoTlJcbkxseWwrakY2aXU3eUUyL29FWXIvZER6QXgwdHVrcmRNNnJyK1BtcVE1TjYzYmVoeWYzakRKZ2ZyZXM3ZzlDNkpcbktySTA3dFcvMVNpOWVUc3NHMkVUVHl2NVduNkNyd1ltREwvOVcwaGpWNVdWN3RXQ1ZMSjIzVm1BcjJHdnZyMDFcbjRwMWcyQzEwV1huT0E2UTVuaGVkOHV6YWJtNGRXMnhmZGVoQWRCcno3d0tCZ1FEMTZsZExPcHQwcElZQWpQM2VcbkZkYUFxZUJHWkxGTndJU1RjVGdNQjVBYmtwandDOUpDbm9TNHRJOHlnTjl1Zyt3VGt0cmxTWS9ZNzIxTUZJZllcbm9FV0pKNnpvTldHRVJ3ZUhUNk40VURZaXIrNHBUNGVWYWVNMzlnTlU4UlMremowOElqNFlacmV1R21CTGpHWCtcbm82bDloVy95dkFuaDFxZHNhMldhSENEMTZ3S0JnUURsSzZBaGFMcmcvOWk2VFl5QkJObU0rTy9DdFpsYUNWUzJcbkUvd09GbUczSzhqck9LRS9yV1lQSW1BQ1p4YWl5dFRvTXU4ZFc2K2NLcENDSkdBTVhpMUpoWGZvK1dOWi93Q2xcbi9EUTZ0VGZ1dk5oN25xKzFLZWtxYVp0aUYrNzNXU3hzcGpzZW5LRFg5SWZaMzhzNFNNUzVUZzdFQ0wvd1pia3FcbktERC8vTGJMNndLQmdFTzIyWDZ2anFyWnVzUmdEbStlMThmcC93V2pLR2RlZ2FNUDQvejhBQ1IzZzRGbDMrblVcbk9IdWJ6R3A5cmdpQ2J2a2MwUVdkOGV3c1VZNUhnUGlYZVU1QkRJMk1WV1BWSXkrUk1GUXEwaDFQRUdkenJNUHBcbnVsVm9lcFpqSS9FK1hRSTM4NTFJZTMrSFo4aWx5bGdKdk53QmFFZ1FtekFDcVd0alQwRFdTZ1V0QW9HQVpCMFlcbnlUK05WRG13bmtLK2ZLWjN1NFFNaWN6M2YwUFFRL0tiRERSdTM2dzdDN2NqaWtQZjhBQ2VYSzVZVHltNHRPOTdcblVpSDVwNGxZcytIY0s4c0FrYnZDMUg0T0R3UzliY1d0czIvelRWSW1hR3E4YTdJeGNCdk9pNTNWQVMxdG9ORkZcbnhtdTZRRjFNODdzMmRoSWtEcWV3LzZhcTR3UXRUZU5jOUplYjY1MENnWUVBdTgxdGo5b2o1TXN3amVnNmE0dkVcbnZoR2F6NFpjTk9ha1VBUGtnRHljd0cwUGJWZzFzd29rcjRhUnZxYkVlc1FJelllMWdsMlZnNnFLWk94cjNIbDFcbnhFbDVnODJxVHJycWxxTjhDZHU3bjRtTitncGFlVjRhbytsdlU1SUZsdW9sYnlwZnoybk12U3NraE0zMHJKT2NcbmFxbEUyRDR1TWFQYys1UzgwTjFLbnlBPVxuLS0tLS1FTkQgUFJJVkFURSBLRVktLS0tLVxuIiwiY2xpZW50X2VtYWlsIjogInNhLXNwcmluZy1idWtldEBjcGwtY29ycC1jYXBwZmItZGV2LTE2MDcyMDI0LmlhbS5nc2VydmljZWFjY291bnQuY29tIiwiY2xpZW50X2lkIjogIjEwMTUzNTY3MDgwMDkxNDMzMzg4OCIsImF1dGhfdXJpIjogImh0dHBzOi8vYWNjb3VudHMuZ29vZ2xlLmNvbS9vL29hdXRoMi9hdXRoIiwidG9rZW5fdXJpIjogImh0dHBzOi8vb2F1dGgyLmdvb2dsZWFwaXMuY29tL3Rva2VuIiwiYXV0aF9wcm92aWRlcl94NTA5X2NlcnRfdXJsIjogImh0dHBzOi8vd3d3Lmdvb2dsZWFwaXMuY29tL29hdXRoMi92MS9jZXJ0cyIsImNsaWVudF94NTA5X2NlcnRfdXJsIjogImh0dHBzOi8vd3d3Lmdvb2dsZWFwaXMuY29tL3JvYm90L3YxL21ldGFkYXRhL3g1MDkvc2Etc3ByaW5nLWJ1a2V0JTQwY3BsLWNvcnAtY2FwcGZiLWRldi0xNjA3MjAyNC5pYW0uZ3NlcnZpY2VhY2NvdW50LmNvbSIsInVuaXZlcnNlX2RvbWFpbiI6ICJnb29nbGVhcGlzLmNvbSI=
ADD ./target/app.jar  ./
COPY  ./src/main/resources/application.yaml  ./application.yaml
ADD  ./src/main/resources/log4j2-spring.xml  ./
ENTRYPOINT ["java"]
CMD ["-XX:+UseSerialGC", "-Xss512k", "-Xms128m", "-Xmx256m", "-jar", "app.jar", "--spring.config.location=./application.yaml"]
