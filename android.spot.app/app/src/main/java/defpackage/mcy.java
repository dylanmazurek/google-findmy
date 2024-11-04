package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcy {
    public final mak a;
    public mas b;
    public mat c;
    final /* synthetic */ mrx d;

    public mcy(mrx mrxVar, mak makVar) {
        this.d = mrxVar;
        this.a = makVar;
        mat a = ((mau) mrxVar.a).a((String) mrxVar.b);
        this.c = a;
        if (a != null) {
            this.b = a.a(makVar);
            return;
        }
        throw new IllegalStateException("Could not find policy '" + ((String) mrxVar.b) + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
    }
}
