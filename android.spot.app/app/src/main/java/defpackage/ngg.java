package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngg {
    public final nfu a;
    public final List b;
    public final List c;
    public final nfk d;
    public final nft e;
    public final nfw f;
    public ProxySelector g;
    public final nfk h;
    public final SocketFactory i;
    public SSLSocketFactory j;
    public X509TrustManager k;
    public List l;
    public final List m;
    public final HostnameVerifier n;
    public final nfn o;
    public nkh p;
    public final njz q;
    public ktf r;
    public final ktf s;

    public ngg() {
        this.a = new nfu();
        this.s = new ktf((byte[]) null, (byte[]) null, (byte[]) null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.q = new njz(nfx.a);
        nfk nfkVar = nfk.a;
        this.d = nfkVar;
        this.e = nft.a;
        this.f = nfw.a;
        this.h = nfkVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.i = socketFactory;
        this.l = ngh.b;
        this.m = ngh.a;
        this.n = nki.a;
        this.o = nfn.a;
    }

    public ngg(ngh nghVar) {
        this();
        this.a = nghVar.c;
        this.s = nghVar.u;
        mkm.an(this.b, nghVar.d);
        mkm.an(this.c, nghVar.e);
        this.q = nghVar.s;
        this.d = nghVar.f;
        this.e = nghVar.g;
        this.f = nghVar.h;
        this.g = nghVar.i;
        this.h = nghVar.j;
        this.i = nghVar.k;
        this.j = nghVar.l;
        this.k = nghVar.m;
        this.l = nghVar.n;
        this.m = nghVar.o;
        this.n = nghVar.p;
        this.o = nghVar.q;
        this.p = nghVar.r;
        this.r = nghVar.t;
    }
}
