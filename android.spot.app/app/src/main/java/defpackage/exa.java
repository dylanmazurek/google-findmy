package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Parcelable;
import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exa {
    public final ele a;
    private final ejo b;
    private final ewc c;
    private final eim d;
    private final Context e;
    private final efy f;
    private final ewg g;
    private final cfk h;
    private final jer i;
    private final cfm j = new cfm(null);
    private final cfm k = new cfm(null);
    private final cfm l = new cfm(null);
    private final cfm m = new cfm(null);
    private final cfm n = new cfm(null);
    private final cfm o = new cfm(null);
    private final cfm p = new cfm(null);
    private final cfm q = new cfm(null);
    private final cfn r = new cfn(false);
    private final emx s;
    private final ewf t;
    private final ezl u;
    private final ewf v;
    private final ilv w;
    private final bym x;
    private final apc y;

    public exa(apc apcVar, emx emxVar, ejo ejoVar, ewc ewcVar, ewf ewfVar, eim eimVar, ele eleVar, Context context, ilv ilvVar, efy efyVar, ewg ewgVar, ewf ewfVar2, ezl ezlVar, bym bymVar, cfk cfkVar, jer jerVar) {
        this.y = apcVar;
        this.s = emxVar;
        this.b = ejoVar;
        this.c = ewcVar;
        this.t = ewfVar;
        this.d = eimVar;
        this.a = eleVar;
        this.e = context;
        this.w = ilvVar;
        this.f = efyVar;
        this.g = ewgVar;
        this.v = ewfVar2;
        this.u = ezlVar;
        this.x = bymVar;
        this.h = cfkVar;
        this.i = jerVar;
    }

    private final cfm j(ewz ewzVar) {
        switch (ewzVar) {
            case NON_SPOT_ENABLED_ANDROID_DEVICE:
                return this.j;
            case SUPERVISED_ANDROID_DEVICE:
                return this.p;
            case SPOT_ENABLED_ANDROID_DEVICE:
                return this.k;
            case SPOT_DEVICE:
                return this.l;
            case SPOT_FMA_DEVICE:
                return this.m;
            case USER:
                return this.n;
            case USER_WORK_PROFILE:
                return this.o;
            case LOCATION_SHARING:
                return this.q;
            default:
                throw new AssertionError("unreachable");
        }
    }

    private final jer k() {
        jer l = l();
        if (!l.g()) {
            return jdl.a;
        }
        efy efyVar = this.f;
        lqd lqdVar = ((lqc) l.c()).d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        return jer.h(efyVar.a(lqdVar));
    }

    private final jer l() {
        return jer.h(this.t.a());
    }

    private static boolean m(jis jisVar, ewo... ewoVarArr) {
        Stream stream = DesugarArrays.stream(ewoVarArr);
        jisVar.getClass();
        return stream.anyMatch(new ehc(jisVar, 5));
    }

    private final boolean n(lqc lqcVar, Instant instant) {
        eiv a;
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (Collection.EL.stream(this.y.n(lqdVar).values()).anyMatch(new eju(15))) {
            return false;
        }
        Parcelable a2 = this.c.a(lqdVar);
        if (!(a2 instanceof eix)) {
            a = null;
        } else {
            a = ((eix) a2).a();
        }
        if (a == null) {
            return false;
        }
        kyh kyhVar = (kyh) this.h.d();
        kyhVar.getClass();
        eit a3 = a.a(kyhVar);
        jer jerVar = a3.d;
        if (!jerVar.g()) {
            return false;
        }
        kzb kzbVar = (kzb) jerVar.c();
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        int i = kzbVar.a;
        if ((i & 1) != 0 && (i & 2) != 0) {
            lln llnVar = kzbVar.c;
            if (llnVar == null) {
                llnVar = lln.c;
            }
            if (hzc.au(llnVar).isAfter(instant)) {
                return false;
            }
        }
        if (a3.f.g() && ofEpochMilli.minus(Duration.ofMillis(SystemClock.elapsedRealtime())).plus(Duration.ofMillis(((Long) a3.f.c()).longValue())).isAfter(instant)) {
            return false;
        }
        return true;
    }

    public final void a(boolean z) {
        this.r.l(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0316, code lost:            if ((r2.a & 67108864) != 0) goto L163;     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0342, code lost:            if (defpackage.eku.g((defpackage.lqc) l().c(), r11.a).isEmpty() == false) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03ed, code lost:            if (r11.y.p(r2) != false) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0415, code lost:            if (((java.lang.Boolean) l().b(new defpackage.ett(r11, 20)).d(new defpackage.enj(r11, r8))).booleanValue() != false) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x043d, code lost:            if (((java.lang.Boolean) l().b(new defpackage.ett(r11, 19)).d(new defpackage.enj(r11, r4))).booleanValue() != false) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0463, code lost:            if (((java.lang.Boolean) l().b(new defpackage.ewy(r11, 2)).d(new defpackage.enj(r11, r7))).booleanValue() != false) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x048a, code lost:            if (((java.lang.Boolean) l().b(new defpackage.ett(r11, 18)).d(new defpackage.enj(r11, r3))).booleanValue() != false) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x049b, code lost:            if (r11.b.a() == defpackage.ejn.OUT_OF_SYNC) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02ab, code lost:            if (((java.lang.Boolean) r2.e(true)).booleanValue() == false) goto L164;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0024. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v139, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v142, types: [android.content.SharedPreferences, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.ewz r12) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exa.b(ewz):void");
    }

    public final boolean c() {
        jis c = this.g.c();
        if (c != null && Collection.EL.stream(c).anyMatch(new eju(16))) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        boolean z;
        int i = this.s.k;
        if (i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final boolean e() {
        if (this.s.h() != 3) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (a.f() && !emm.a(this.e)) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (!a.f() && !emm.a(this.e)) {
            return true;
        }
        return false;
    }

    public final cfk h(int i) {
        final ewz ewzVar;
        cfk eycVar;
        int i2 = i - 1;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (this.u.b()) {
                        ewzVar = ewz.USER_WORK_PROFILE;
                    } else {
                        ewzVar = ewz.USER;
                    }
                } else {
                    ewzVar = ewz.SPOT_FMA_DEVICE;
                }
            } else {
                ewzVar = ewz.SPOT_DEVICE;
            }
        } else {
            jer l = l();
            ele eleVar = this.a;
            eleVar.getClass();
            if (((Boolean) l.b(new ewy(eleVar, 0)).e(false)).booleanValue()) {
                ewzVar = ewz.SPOT_ENABLED_ANDROID_DEVICE;
            } else {
                if (l.g()) {
                    lqd lqdVar = ((lqc) l.c()).d;
                    if (lqdVar == null) {
                        lqdVar = lqd.d;
                    }
                    lqf b = lqf.b(lqdVar.c);
                    if (b == null) {
                        b = lqf.UNRECOGNIZED;
                    }
                    if (b == lqf.SUPERVISED_ANDROID_DEVICE) {
                        ewzVar = ewz.SUPERVISED_ANDROID_DEVICE;
                    }
                }
                ewzVar = ewz.NON_SPOT_ENABLED_ANDROID_DEVICE;
            }
        }
        cfm j = j(ewzVar);
        if (j.d() == null) {
            j.l(ewo.NONE);
            jis jisVar = ewzVar.i;
            final int i6 = 3;
            if (m(jisVar, ewo.ENABLE_FIND_MY_DEVICE, ewo.ENABLE_FIND_MY_DEVICE_NETWORK)) {
                j.o(this.d.d, new eqn(this, ewzVar, 3));
            }
            if (m(jisVar, ewo.ENABLE_LOCATION, ewo.ENABLE_BLUETOOTH, ewo.GIVE_LOCATION_PERMISSION, ewo.GIVE_BLUETOOTH_PERMISSION)) {
                j.o(this.s.c, new eqn(this, ewzVar, 7));
            }
            if (m(jisVar, ewo.PENDING_APPLICATIONS, ewo.ENABLE_BLUETOOTH, ewo.ENABLE_LOCATION, ewo.GIVE_BLUETOOTH_PERMISSION, ewo.GIVE_LOCATION_PERMISSION)) {
                this.g.g(new ewk(this) { // from class: ewx
                    public final /* synthetic */ exa a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ewk
                    public final void cx() {
                        int i7 = i4;
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    this.a.b(ewzVar);
                                    return;
                                } else {
                                    this.a.b(ewzVar);
                                    return;
                                }
                            }
                            this.a.b(ewzVar);
                            return;
                        }
                        this.a.b(ewzVar);
                    }
                });
            }
            if (m(jisVar, ewo.SWITCH_ACCOUNT, ewo.SHARE_LOCATION_SUPERVISED_DEVICE, ewo.ENABLE_GOOGLE_LOCATION_ACCURACY_SUPERVISED_DEVICE)) {
                this.f.d(new ewk(this) { // from class: ewx
                    public final /* synthetic */ exa a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ewk
                    public final void cx() {
                        int i7 = i5;
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    this.a.b(ewzVar);
                                    return;
                                } else {
                                    this.a.b(ewzVar);
                                    return;
                                }
                            }
                            this.a.b(ewzVar);
                            return;
                        }
                        this.a.b(ewzVar);
                    }
                });
            }
            if (jisVar.contains(ewo.SYNC_DEVICE)) {
                j.o(this.b.h, new eqn(this, ewzVar, 8));
            }
            if (m(jisVar, ewo.NEARBY_DEVICE, ewo.ENABLE_FIND_MY_DEVICE_NETWORK, ewo.FIND_MY_DEVICE_NETWORK_ALL_AREAS)) {
                this.w.g(new ewk(this) { // from class: ewx
                    public final /* synthetic */ exa a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ewk
                    public final void cx() {
                        int i7 = i3;
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    this.a.b(ewzVar);
                                    return;
                                } else {
                                    this.a.b(ewzVar);
                                    return;
                                }
                            }
                            this.a.b(ewzVar);
                            return;
                        }
                        this.a.b(ewzVar);
                    }
                });
                j.o(this.h, new eqn(this, ewzVar, 9));
            }
            if (m(jisVar, ewo.LOST_DEVICE)) {
                this.t.b(new ewk(this) { // from class: ewx
                    public final /* synthetic */ exa a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ewk
                    public final void cx() {
                        int i7 = i6;
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    this.a.b(ewzVar);
                                    return;
                                } else {
                                    this.a.b(ewzVar);
                                    return;
                                }
                            }
                            this.a.b(ewzVar);
                            return;
                        }
                        this.a.b(ewzVar);
                    }
                });
            }
            if (m(jisVar, ewo.ENABLE_FIND_MY_DEVICE, ewo.FIND_MY_DEVICE_NETWORK_ALL_AREAS)) {
                j.o(this.v.i(), new eqn(this, ewzVar, 10));
                j.o((cfk) this.y.b, new eqn(this, ewzVar, 11));
            }
            if (m(jisVar, ewo.SPOT_LAUNCH_IN_APP_PROMOTION)) {
                j.o(this.r, new eqn(this, ewzVar, 4));
            }
            if (m(jisVar, ewo.ENABLE_LOCATION_SHARING_ON_THIS_DEVICE, ewo.ACK_CENTRALIZED_LOCATION_SHARING, ewo.ENABLE_LOCATION_IN_SETTINGS, ewo.DISABLE_BATTERY_SAVER, ewo.SHOW_THE_DEVICE_INELIGIBLE_MESSAGE)) {
                jer jerVar = this.i;
                if (jerVar.g()) {
                    j.o(((eun) jerVar.c()).a(), new eqn(this, ewzVar, 5));
                }
            }
            if (m(jisVar, ewo.ENABLE_INTERNET_CONNECTION)) {
                Context context = this.e;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    eycVar = new cfn(false);
                } else {
                    eycVar = new eyc(context, connectivityManager);
                }
                j.o(eycVar, new eqn(this, ewzVar, 6));
            }
            b(ewzVar);
        }
        return j;
    }

    public final boolean i(int i) {
        return ((Boolean) k().b(new eww(i, 0)).e(false)).booleanValue();
    }
}
