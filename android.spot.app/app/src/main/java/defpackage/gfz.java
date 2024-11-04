package defpackage;

import android.os.SystemClock;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfz extends mnp implements mol {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    int h;
    final /* synthetic */ gga i;
    final /* synthetic */ String j;
    final /* synthetic */ String k = "rendered_notifications_from_spot";
    final /* synthetic */ gwf l;
    final /* synthetic */ lga m;
    final /* synthetic */ gnd n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfz(gga ggaVar, String str, gwf gwfVar, lga lgaVar, gnd gndVar, mmx mmxVar) {
        super(2, mmxVar);
        this.i = ggaVar;
        this.j = str;
        this.l = gwfVar;
        this.m = lgaVar;
        this.n = gndVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gfz) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, gvi] */
    /* JADX WARN: Type inference failed for: r4v23, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [ghf, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        String str2;
        gwf gwfVar;
        Object obj5;
        long epochMilli;
        lde ldeVar;
        lcn lcnVar;
        mne mneVar = mne.a;
        if (this.h != 0) {
            obj3 = this.g;
            obj2 = this.f;
            Object obj6 = this.e;
            Object obj7 = this.d;
            Object obj8 = this.c;
            Object obj9 = this.b;
            obj4 = this.a;
            mjo.o(obj);
            obj5 = obj6;
            gwfVar = obj7;
            str2 = obj8;
            str = obj9;
        } else {
            mjo.o(obj);
            gga ggaVar = this.i;
            String str3 = this.j;
            String str4 = this.k;
            gwf gwfVar2 = this.l;
            obj2 = this.m;
            gnd gndVar = this.n;
            Object obj10 = ggaVar.h;
            this.a = obj10;
            this.b = str3;
            this.c = str4;
            this.d = gwfVar2;
            this.e = ggaVar;
            this.f = obj2;
            this.g = gndVar;
            this.h = 1;
            if (((ncd) obj10).b(this) != mneVar) {
                obj3 = gndVar;
                obj4 = obj10;
                obj5 = ggaVar;
                gwfVar = gwfVar2;
                str2 = str4;
                str = str3;
            } else {
                return mneVar;
            }
        }
        try {
            if (str.length() > 0) {
                if (str2.length() > 0) {
                    if (gwfVar instanceof gwh) {
                        if (((gwh) gwfVar).a.length() > 0) {
                            if (((gga) obj5).b.b(((gwh) gwfVar).a)) {
                                try {
                                    goa w = ((ddg) ((gga) obj5).f).w(gwfVar);
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    Object obj11 = ((gga) obj5).g;
                                    epochMilli = fma.i().toEpochMilli();
                                    long micros = timeUnit.toMicros(epochMilli);
                                    long nextInt = ((Random) ((gga) obj5).d).nextInt(1000) + micros;
                                    str.getClass();
                                    str2.getClass();
                                    String str5 = "a:" + str2 + ":" + str;
                                    ljh k = lgf.s.k();
                                    k.getClass();
                                    str.getClass();
                                    if (!k.b.y()) {
                                        k.t();
                                    }
                                    ljn ljnVar = k.b;
                                    lgf lgfVar = (lgf) ljnVar;
                                    lgfVar.a |= 8;
                                    lgfVar.f = str;
                                    str2.getClass();
                                    if (!ljnVar.y()) {
                                        k.t();
                                    }
                                    ljn ljnVar2 = k.b;
                                    lgf lgfVar2 = (lgf) ljnVar2;
                                    lgfVar2.a |= 4;
                                    lgfVar2.e = str2;
                                    if (!ljnVar2.y()) {
                                        k.t();
                                    }
                                    ljn ljnVar3 = k.b;
                                    lgf lgfVar3 = (lgf) ljnVar3;
                                    lgfVar3.a |= 2;
                                    lgfVar3.d = str5;
                                    if (!ljnVar3.y()) {
                                        k.t();
                                    }
                                    ljn ljnVar4 = k.b;
                                    lgf lgfVar4 = (lgf) ljnVar4;
                                    lgfVar4.a |= 32;
                                    lgfVar4.g = nextInt;
                                    if (!ljnVar4.y()) {
                                        k.t();
                                    }
                                    ljn ljnVar5 = k.b;
                                    lgf lgfVar5 = (lgf) ljnVar5;
                                    lgfVar5.a |= 512;
                                    lgfVar5.j = micros;
                                    if (!ljnVar5.y()) {
                                        k.t();
                                    }
                                    ljn ljnVar6 = k.b;
                                    lgf lgfVar6 = (lgf) ljnVar6;
                                    lgfVar6.a |= 1024;
                                    lgfVar6.k = micros;
                                    obj2.getClass();
                                    if (!ljnVar6.y()) {
                                        k.t();
                                    }
                                    ljn ljnVar7 = k.b;
                                    lgf lgfVar7 = (lgf) ljnVar7;
                                    lgfVar7.c = obj2;
                                    lgfVar7.b = 12;
                                    if (!ljnVar7.y()) {
                                        k.t();
                                    }
                                    lgf lgfVar8 = (lgf) k.b;
                                    lgfVar8.q = 1;
                                    lgfVar8.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                                    ljn q = k.q();
                                    q.getClass();
                                    lgf lgfVar9 = (lgf) q;
                                    jis u = ((ddg) ((gga) obj5).i).u(w, str5);
                                    if (u.isEmpty()) {
                                        ldeVar = lde.LOCAL_NOTIFICATION_CREATED;
                                    } else {
                                        ldeVar = lde.LOCAL_NOTIFICATION_UPDATED;
                                    }
                                    ghg b = ((gga) obj5).c.b(ldeVar);
                                    b.e(w);
                                    b.f(lgfVar9);
                                    b.h(micros);
                                    b.a();
                                    git gitVar = (git) ((gga) obj5).a.a();
                                    List N = mkm.N(lgfVar9);
                                    Long valueOf = Long.valueOf(micros);
                                    Object obj12 = ((gga) obj5).g;
                                    Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime());
                                    if (u.isEmpty()) {
                                        lcnVar = lcn.LOCAL_NOTIFICATION_CREATED;
                                    } else {
                                        lcnVar = lcn.LOCAL_NOTIFICATION_UPDATED;
                                    }
                                    gitVar.c(w, N, (gnd) obj3, new ghh(valueOf, valueOf2, lcnVar));
                                    return str5;
                                } catch (goi e) {
                                    throw new gfy("Error creating account: ".concat(((gwh) gwfVar).a), e);
                                }
                            }
                            throw new gfy("Account not available on device: ".concat(((gwh) gwfVar).a));
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        } finally {
            ((ncd) obj4).d();
        }
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new gfz(this.i, this.j, this.l, this.m, this.n, mmxVar);
    }
}
