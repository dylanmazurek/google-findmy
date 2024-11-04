package defpackage;

import j$.util.Collection;
import j$.util.Map;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eiu {
    public final Map a;
    public jer b;
    public jer c;
    public Boolean d;
    public jer e;
    private boolean f;
    private jiy g;
    private byte h;

    public eiu(byte[] bArr) {
        this();
        jdl jdlVar = jdl.a;
        this.b = jdlVar;
        this.c = jdlVar;
        this.e = jdlVar;
    }

    public final eiv a() {
        Boolean bool;
        jiy jiyVar;
        if (this.a.isEmpty()) {
            b(jiy.j(kyh.DEVICE_COMPONENT_UNSPECIFIED, eit.c));
        } else {
            b((jiy) Collection.EL.stream(this.a.entrySet()).collect(jgr.a(new eff(3), new eff(4))));
        }
        boolean z = true;
        if (this.h == 1 && (bool = this.d) != null && (jiyVar = this.g) != null) {
            eih eihVar = new eih(this.b, this.f, this.c, bool, jiyVar, this.e);
            if (eihVar.f.g() && eihVar.e) {
                z = false;
            }
            hwx.U(z);
            return eihVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" locationFailure");
        }
        if (this.d == null) {
            sb.append(" isRetryingLocateRequest");
        }
        if (this.g == null) {
            sb.append(" componentStates");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(jiy jiyVar) {
        if (jiyVar != null) {
            this.g = jiyVar;
            return;
        }
        throw new NullPointerException("Null componentStates");
    }

    public final void c(kyh kyhVar, Consumer consumer) {
        consumer.accept((eir) Map.EL.computeIfAbsent(this.a, kyhVar, new eff(2)));
    }

    public final void d(boolean z) {
        this.f = z;
        this.h = (byte) 1;
    }

    public eiu(eiv eivVar) {
        this();
        jdl jdlVar = jdl.a;
        this.b = jdlVar;
        this.c = jdlVar;
        this.e = jdlVar;
        this.b = eivVar.d;
        this.f = eivVar.e;
        this.c = eivVar.f;
        this.d = eivVar.g;
        this.g = eivVar.h;
        this.e = eivVar.i;
        this.h = (byte) 1;
    }

    public eiu() {
        this.a = new EnumMap(kyh.class);
    }
}
