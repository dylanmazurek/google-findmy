package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhm {
    public final nfi a;
    public List b;
    public int c;
    public List d;
    public final List e;
    public final ktf f;

    public nhm(nfi nfiVar, ktf ktfVar) {
        List m;
        this.a = nfiVar;
        this.f = ktfVar;
        mlx mlxVar = mlx.a;
        this.b = mlxVar;
        this.d = mlxVar;
        this.e = new ArrayList();
        URI e = nfiVar.h.e();
        if (e.getHost() == null) {
            m = ngt.m(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = nfiVar.g.select(e);
            if (select != null && !select.isEmpty()) {
                m = ngt.n(select);
            } else {
                m = ngt.m(Proxy.NO_PROXY);
            }
        }
        this.b = m;
        this.c = 0;
        m.getClass();
    }

    public final boolean a() {
        if (!b() && this.e.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.c < this.b.size()) {
            return true;
        }
        return false;
    }
}
