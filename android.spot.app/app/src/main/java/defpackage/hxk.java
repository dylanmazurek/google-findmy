package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hxk implements jxd {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ hxk(hvq hvqVar, jyz jyzVar, hxe hxeVar, String str, int i) {
        this.e = i;
        this.a = hvqVar;
        this.b = jyzVar;
        this.c = hxeVar;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ihn] */
    /* JADX WARN: Type inference failed for: r4v5, types: [icq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [icm, java.lang.Object] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        jyz E;
        int i = this.e;
        int i2 = 5;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    int i3 = 0;
                    if (i != 3) {
                        int i4 = 4;
                        if (i != 4) {
                            if (i != 5) {
                                jer jerVar = (jer) obj;
                                final boolean g = ((jer) this.b).g();
                                if (jerVar.g()) {
                                    return ivc.E(new iid(jerVar, true, false));
                                }
                                final jer jerVar2 = (jer) this.c;
                                if (!jerVar2.g()) {
                                    return ivc.E(new iid(jdl.a, false, g));
                                }
                                Object obj2 = this.a;
                                kym kymVar = ((iif) jerVar2.c()).a;
                                if (kymVar.b == 10) {
                                    E = ((iil) obj2).c((kyf) this.d, (kyo) kymVar.c);
                                } else {
                                    ((jni) ((jni) iil.a.g()).j("com/google/android/libraries/spot/e2ee/E2eeLocationDecryptorImpl", "decryptNonAggregatedGeoLocation", 211, "E2eeLocationDecryptorImpl.java")).r("Device has no encrypted location");
                                    E = ivc.E(jdl.a);
                                }
                                return jbx.d(E).e(new jei() { // from class: iii
                                    @Override // defpackage.jei
                                    public final Object a(Object obj3) {
                                        jer jerVar3 = jer.this;
                                        boolean z2 = false;
                                        jer b = ((jer) obj3).b(new iig(jerVar3, 0));
                                        int I = a.I(((iif) jerVar3.c()).a.e);
                                        if (I == 0) {
                                            I = 1;
                                        }
                                        boolean z3 = g;
                                        if (I == 5) {
                                            z2 = true;
                                        }
                                        return new iid(b, z2, z3);
                                    }
                                }, ((iil) obj2).c);
                            }
                            ((igx) this.c).b(igq.UNPROVISIONING_LOCALLY);
                            Object obj3 = this.d;
                            ico icoVar = ico.CLEAR_EPHEMERAL_IDENTIFIER_KEY;
                            ifc ifcVar = new ifc((lim) obj3, 1);
                            icn icnVar = (icn) this.a;
                            return jbx.d(icnVar.a.c(icoVar, (lim) this.b, ifcVar)).e(new iaf(i4), icnVar.b);
                        }
                        if (((icl) obj).a) {
                            igx igxVar = (igx) this.c;
                            igxVar.b(igq.UNPROVISIONING_IN_SERVER);
                            kxv kxvVar = igxVar.b.b;
                            if (kxvVar == null) {
                                kxvVar = kxv.b;
                            }
                            ksr ksrVar = new ksr(kxvVar);
                            ljh ljhVar = (ljh) ksrVar.b;
                            if (!ljhVar.b.y()) {
                                ljhVar.t();
                            }
                            hnu hnuVar = igxVar.d;
                            Object obj4 = this.d;
                            Object obj5 = this.b;
                            ?? r8 = this.a;
                            ((kyf) ljhVar.b).p = a.B(4);
                            ((ljh) ksrVar.a).J("provisioning_completed");
                            return jbx.d(hnuVar.m(ksrVar.G())).b(Exception.class, new igw(i3), jxv.a).f(new hxk(igxVar, (icm) r8, (lim) obj5, (lim) obj4, 5), igxVar.a);
                        }
                        return jyv.a;
                    }
                    lim limVar = (lim) obj;
                    int d = limVar.d();
                    Object obj6 = this.b;
                    ?? r4 = this.c;
                    Object obj7 = this.a;
                    if (d <= 8) {
                        return ivc.D(new iea("Invalid challenge data length: " + limVar.d()));
                    }
                    try {
                        byte a = limVar.a(0);
                        if (a == 1) {
                            icx icxVar = icx.a;
                            lim j = limVar.j(1, 9);
                            lim a2 = r4.a(j);
                            icv icvVar = (icv) obj6;
                            synchronized (icvVar.h) {
                                Object c = ((icv) obj6).j.c();
                                ((icv) obj6).j = jer.i(hzc.c(((icr) c).a, ((icr) c).b, jer.i(icxVar), jer.i(j)));
                                if (icv.c.contains(obj7)) {
                                    ((icv) obj6).k.put(obj7, ((icv) obj6).j.c());
                                    ((icv) obj6).m.c(lim.b);
                                }
                            }
                            Object obj8 = this.d;
                            idt idtVar = icvVar.o;
                            BluetoothGattCharacteristic bluetoothGattCharacteristic = icvVar.g;
                            lim limVar2 = (lim) ((jer) obj8).e(icv.d);
                            int d2 = a2.d() + 8;
                            byte[] bArr = {icxVar.b};
                            int i5 = iji.a;
                            ico icoVar2 = (ico) obj7;
                            lim j2 = ijm.h(limVar2, lim.t(bArr).r(j).r(iji.f(icoVar2.o, d2)).r(a2)).j(0, 8);
                            if (d2 > 127) {
                                z = false;
                            }
                            hwx.U(z);
                            return idtVar.h(bluetoothGattCharacteristic, iji.f(icoVar2.o, d2).r(j2).r(a2));
                        }
                        throw new Exception("Unsupported protocol version: " + ((int) a));
                    } catch (Exception e) {
                        return ivc.D(new iei(e.getMessage()));
                    }
                }
                Object obj9 = this.d;
                if (!((String) obj).equals(obj9)) {
                    return jyv.a;
                }
                if (hxm.c.containsKey(new jes(((hxe) this.c).a, obj9))) {
                    return jyv.a;
                }
                return ((hvq) this.a).f().c(((hxw) this.b).b);
            }
            return ((enk) this.a).d.a((kxx) this.d, this.c, (ihw) this.b);
        }
        hxw hxwVar = (hxw) ivc.M(this.b);
        if (hxwVar.b.isEmpty()) {
            return jyv.a;
        }
        Object obj10 = this.d;
        Object obj11 = this.c;
        hvq hvqVar = (hvq) this.a;
        hxe hxeVar = (hxe) obj11;
        return jwu.h(jys.q(jwu.g(jys.q(hxg.b(hvqVar).a()), new huw(hxeVar.a, i2), hvqVar.b())), new hxk((String) obj10, hxeVar, hvqVar, hxwVar, 2), hvqVar.b());
    }

    public /* synthetic */ hxk(icv icvVar, icq icqVar, ico icoVar, jer jerVar, int i) {
        this.e = i;
        this.b = icvVar;
        this.c = icqVar;
        this.a = icoVar;
        this.d = jerVar;
    }

    public /* synthetic */ hxk(igx igxVar, icm icmVar, lim limVar, lim limVar2, int i) {
        this.e = i;
        this.c = igxVar;
        this.a = icmVar;
        this.b = limVar;
        this.d = limVar2;
    }

    public /* synthetic */ hxk(Object obj, ljn ljnVar, Object obj2, Object obj3, int i) {
        this.e = i;
        this.a = obj;
        this.d = ljnVar;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hxk(String str, hxe hxeVar, hvq hvqVar, hxw hxwVar, int i) {
        this.e = i;
        this.d = str;
        this.c = hxeVar;
        this.a = hvqVar;
        this.b = hxwVar;
    }
}
