package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhn implements nge {
    private final nft a;

    public nhn(nft nftVar) {
        this.a = nftVar;
    }

    @Override // defpackage.nge
    public final ngn a(nht nhtVar) {
        ngp ngpVar;
        ngk ngkVar = nhtVar.c;
        ngj ngjVar = new ngj(ngkVar);
        msz mszVar = ngkVar.f;
        if (mszVar != null) {
            ngf ngfVar = ((ngl) mszVar).a;
            if (ngfVar != null) {
                ngjVar.c("Content-Type", ngfVar.c);
            }
            ngjVar.c("Content-Length", String.valueOf(mszVar.w()));
            ngjVar.b("Transfer-Encoding");
        }
        boolean z = false;
        if (ngkVar.a("Host") == null) {
            ngjVar.c("Host", ngt.k(ngkVar.a, false));
        }
        if (ngkVar.a("Connection") == null) {
            ngjVar.c("Connection", "Keep-Alive");
        }
        if (ngkVar.a("Accept-Encoding") == null && ngkVar.a("Range") == null) {
            ngjVar.c("Accept-Encoding", "gzip");
            z = true;
        }
        if (ngkVar.a("User-Agent") == null) {
            ngjVar.c("User-Agent", "okhttp/4.12.0");
        }
        ngn a = nhtVar.a(ngjVar.a());
        nhs.a(this.a, ngkVar.a, a.f);
        ngm ngmVar = new ngm(a);
        ngmVar.a = ngkVar;
        if (z && moz.v("gzip", ngn.a(a, "Content-Encoding")) && nhs.b(a) && (ngpVar = a.g) != null) {
            nkw nkwVar = new nkw(ngpVar.b());
            ktf e = a.f.e();
            e.p("Content-Encoding");
            e.p("Content-Length");
            ngmVar.c(e.m());
            ngn.a(a, "Content-Type");
            ngmVar.e = new nhu(-1L, new nlf(nkwVar));
        }
        return ngmVar.a();
    }
}
