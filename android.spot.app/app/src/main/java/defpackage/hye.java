package defpackage;

import com.google.android.gms.common.Feature;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hye implements jyj {
    final /* synthetic */ hyg a;

    public hye(hyg hygVar) {
        this.a = hygVar;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        if ((th instanceof iek) || (th instanceof iea)) {
            ((jni) ((jni) ((jni) hyg.c.e()).i(th)).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$2", "onFailure", (char) 332, "PrecisionFindingImpl.java")).r("Failed to send capability request message - uncompatible devices");
            this.a.d(3);
        }
        ((jni) ((jni) ((jni) hyg.c.g()).i(th)).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$2", "onFailure", (char) 337, "PrecisionFindingImpl.java")).r("Failed to send capability request message");
        this.a.d(1);
    }

    @Override // defpackage.jyj
    public final /* synthetic */ void b(Object obj) {
        final jyz b;
        fxs f;
        final jyz b2;
        hyk hykVar = (hyk) obj;
        ((jni) ((jni) hyg.c.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$2", "onSuccess", 317, "PrecisionFindingImpl.java")).u("Got capability response message: %s", hykVar);
        this.a.h = Optional.of(hykVar);
        jin jinVar = new jin();
        hyg hygVar = this.a;
        jis jisVar = hygVar.i;
        int size = jisVar.size();
        for (int i = 0; i < size; i++) {
            hyh hyhVar = (hyh) jisVar.get(i);
            int ordinal = hyhVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    hygVar.h.get();
                }
            } else if (((hyk) hygVar.h.get()).b != null) {
                jinVar.h(hyhVar);
            }
        }
        hygVar.j = jinVar.g();
        if (this.a.j.isEmpty()) {
            this.a.d(3);
            return;
        }
        final hyg hygVar2 = this.a;
        synchronized (hygVar2.e) {
            if (hygVar2.p != 3) {
                return;
            }
            jis jisVar2 = hygVar2.j;
            int i2 = ((jmi) jisVar2).c;
            for (int i3 = 0; i3 < i2; i3++) {
                int ordinal2 = ((hyh) jisVar2.get(i3)).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        ((jni) ((jni) hyg.c.g()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "getThisDeviceCapabilities", 383, "PrecisionFindingImpl.java")).r("CS is not supported");
                    }
                } else {
                    synchronized (hygVar2.e) {
                        if (hygVar2.p == 3) {
                            hyy hyyVar = hygVar2.q;
                            if (!hyyVar.f.containsKey(hyh.UWB)) {
                                b = ivc.D(new IllegalStateException("UWB was not requested for this session."));
                            } else {
                                hzb hzbVar = (hzb) hyyVar.f.get(hyh.UWB);
                                if (hzbVar.b.isEmpty()) {
                                    hzbVar.a();
                                    b = ivc.D(new IllegalStateException("UWB is not available."));
                                } else {
                                    Object obj2 = hzbVar.b.get();
                                    fjy fjyVar = new fjy();
                                    fjyVar.a = new fun(2);
                                    fjyVar.b = new Feature[]{ftb.i};
                                    fjyVar.c = 1301;
                                    b = fzo.b(((fhq) obj2).f(fjyVar.a()));
                                }
                            }
                            if (!hyyVar.f.containsKey(hyh.UWB)) {
                                b2 = ivc.D(new IllegalStateException("UWB was not requested for this session."));
                            } else {
                                hzb hzbVar2 = (hzb) hyyVar.f.get(hyh.UWB);
                                if (hzbVar2.b.isEmpty()) {
                                    hzbVar2.a();
                                    b2 = ivc.D(new IllegalStateException("UWB is not available."));
                                } else {
                                    Object obj3 = hzbVar2.b.get();
                                    ftq ftqVar = ((fuu) obj3).a;
                                    if (ftqVar != null) {
                                        f = fma.o(ftqVar);
                                    } else {
                                        fjy fjyVar2 = new fjy();
                                        fjyVar2.a = new fsw(obj3, 4);
                                        fjyVar2.b = new Feature[]{ftb.i};
                                        fjyVar2.c = 1302;
                                        f = ((fhq) obj3).f(fjyVar2.a());
                                    }
                                    b2 = fzo.b(f);
                                }
                            }
                            iuu.F(b, b2).h(new jxc() { // from class: hyd
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:44:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Type inference failed for: r0v15, types: [java.util.concurrent.Executor, java.lang.Object] */
                                @Override // defpackage.jxc
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final defpackage.jyz a() {
                                    /*
                                        Method dump skipped, instructions count: 913
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.hyd.a():jyz");
                                }
                            }, hygVar2.d).b(Exception.class, new hxj(hygVar2, 4), hygVar2.d);
                        }
                    }
                }
            }
        }
    }
}
