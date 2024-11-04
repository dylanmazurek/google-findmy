package defpackage;

import android.os.Build;
import com.google.ar.core.ImageMetadata;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cqm {
    public UUID a;
    public cvu b;
    public final Set c;
    private final Class d;

    public cqm(Class cls) {
        this.d = cls;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.a = randomUUID;
        String uuid = this.a.toString();
        uuid.getClass();
        String name = cls.getName();
        name.getClass();
        this.b = new cvu(uuid, 0, name, (String) null, (cpn) null, (cpn) null, 0L, 0L, 0L, (cpl) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        String name2 = cls.getName();
        name2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(mkm.H(1));
        mkm.x(new String[]{name2}, linkedHashSet);
        this.c = linkedHashSet;
    }

    public abstract apc a();

    public final void b(cpl cplVar) {
        this.b.j = cplVar;
    }

    public final void c(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.b.g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.b.g) {
        } else {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void d(cpn cpnVar) {
        this.b.e = cpnVar;
    }

    public final apc e() {
        boolean z;
        String str;
        apc a = a();
        cpl cplVar = this.b.j;
        if ((Build.VERSION.SDK_INT < 24 || !cplVar.b()) && !cplVar.e && !cplVar.c && (Build.VERSION.SDK_INT < 23 || !cplVar.d)) {
            z = false;
        } else {
            z = true;
        }
        cvu cvuVar = this.b;
        if (cvuVar.p) {
            if (!z) {
                if (cvuVar.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            } else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
        }
        if (cvuVar.v == null) {
            List G = moz.G(cvuVar.c, new String[]{"."});
            if (G.size() == 1) {
                str = (String) G.get(0);
            } else {
                str = (String) mkm.Z(G);
            }
            if (str.length() > 127) {
                str = moz.r(str, 127);
            }
            cvuVar.v = str;
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.a = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        cvu cvuVar2 = this.b;
        cvuVar2.getClass();
        String str2 = cvuVar2.c;
        this.b = new cvu(uuid, cvuVar2.w, str2, cvuVar2.d, new cpn(cvuVar2.e), new cpn(cvuVar2.f), cvuVar2.g, cvuVar2.h, cvuVar2.i, new cpl(cvuVar2.j), cvuVar2.k, cvuVar2.x, cvuVar2.l, cvuVar2.m, cvuVar2.n, cvuVar2.o, cvuVar2.p, cvuVar2.y, cvuVar2.q, cvuVar2.s, cvuVar2.t, cvuVar2.u, cvuVar2.v, ImageMetadata.LENS_APERTURE);
        return a;
    }
}
