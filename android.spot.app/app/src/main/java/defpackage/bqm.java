package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqm {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public bqm(CharSequence charSequence, Bundle bundle, Set set) {
        this.b = "com.google.android.libraries.notifications.REPLY_TEXT_KEY";
        this.c = charSequence;
        this.a = true;
        this.d = bundle;
        this.e = set;
    }

    public final jyz a(String str) {
        hot f = ((hvq) this.d).f();
        str.getClass();
        Object obj = f.a;
        fjy fjyVar = new fjy();
        fjyVar.a = new fpx(this.b, str, 6);
        return jwu.g(hot.d(((fhq) obj).f(fjyVar.a()).a(jxv.a, new fxi() { // from class: hwg
            @Override // defpackage.fxi
            public final Object a(fxs fxsVar) {
                hwe hweVar;
                Configurations configurations = (Configurations) fxsVar.e();
                ljh k = hwd.i.k();
                String str2 = configurations.a;
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar = k.b;
                hwd hwdVar = (hwd) ljnVar;
                str2.getClass();
                int i = 1;
                hwdVar.a |= 1;
                hwdVar.b = str2;
                String str3 = configurations.c;
                if (!ljnVar.y()) {
                    k.t();
                }
                ljn ljnVar2 = k.b;
                hwd hwdVar2 = (hwd) ljnVar2;
                str3.getClass();
                int i2 = 4;
                hwdVar2.a |= 4;
                hwdVar2.d = str3;
                boolean z = configurations.f;
                if (!ljnVar2.y()) {
                    k.t();
                }
                ljn ljnVar3 = k.b;
                hwd hwdVar3 = (hwd) ljnVar3;
                hwdVar3.a |= 8;
                hwdVar3.g = z;
                long j = configurations.g;
                if (!ljnVar3.y()) {
                    k.t();
                }
                hwd hwdVar4 = (hwd) k.b;
                hwdVar4.a |= 16;
                hwdVar4.h = j;
                byte[] bArr = configurations.b;
                int i3 = 2;
                if (bArr != null) {
                    lim t = lim.t(bArr);
                    if (!k.b.y()) {
                        k.t();
                    }
                    hwd hwdVar5 = (hwd) k.b;
                    hwdVar5.a |= 2;
                    hwdVar5.c = t;
                }
                Configuration[] configurationArr = configurations.d;
                int length = configurationArr.length;
                int i4 = 0;
                while (i4 < length) {
                    Configuration configuration = configurationArr[i4];
                    Flag[] flagArr = configuration.b;
                    int length2 = flagArr.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        Flag flag = flagArr[i5];
                        int i6 = flag.g;
                        if (i6 != i) {
                            if (i6 != i3) {
                                if (i6 != 3) {
                                    if (i6 != i2) {
                                        if (i6 == 5) {
                                            ljh k2 = hwe.e.k();
                                            String str4 = flag.a;
                                            if (!k2.b.y()) {
                                                k2.t();
                                            }
                                            hwe hweVar2 = (hwe) k2.b;
                                            str4.getClass();
                                            hweVar2.a |= i;
                                            hweVar2.d = str4;
                                            if (flag.g == 5) {
                                                byte[] bArr2 = flag.f;
                                                fma.aR(bArr2);
                                                lim t2 = lim.t(bArr2);
                                                if (!k2.b.y()) {
                                                    k2.t();
                                                }
                                                hwe hweVar3 = (hwe) k2.b;
                                                hweVar3.b = 5;
                                                hweVar3.c = t2;
                                                hweVar = (hwe) k2.q();
                                            } else {
                                                throw new IllegalArgumentException("Not a bytes type");
                                            }
                                        } else {
                                            throw new IllegalArgumentException(a.ae(i6, "Unrecognized flag type: "));
                                        }
                                    } else {
                                        ljh k3 = hwe.e.k();
                                        String str5 = flag.a;
                                        if (!k3.b.y()) {
                                            k3.t();
                                        }
                                        hwe hweVar4 = (hwe) k3.b;
                                        str5.getClass();
                                        hweVar4.a |= i;
                                        hweVar4.d = str5;
                                        if (flag.g == i2) {
                                            String str6 = flag.e;
                                            fma.aR(str6);
                                            if (!k3.b.y()) {
                                                k3.t();
                                            }
                                            hwe hweVar5 = (hwe) k3.b;
                                            hweVar5.b = i2;
                                            hweVar5.c = str6;
                                            hweVar = (hwe) k3.q();
                                        } else {
                                            throw new IllegalArgumentException("Not a String type");
                                        }
                                    }
                                } else {
                                    ljh k4 = hwe.e.k();
                                    String str7 = flag.a;
                                    if (!k4.b.y()) {
                                        k4.t();
                                    }
                                    ljn ljnVar4 = k4.b;
                                    hwe hweVar6 = (hwe) ljnVar4;
                                    str7.getClass();
                                    hweVar6.a |= i;
                                    hweVar6.d = str7;
                                    if (flag.g == 3) {
                                        double d = flag.d;
                                        if (!ljnVar4.y()) {
                                            k4.t();
                                        }
                                        hwe hweVar7 = (hwe) k4.b;
                                        hweVar7.b = 3;
                                        hweVar7.c = Double.valueOf(d);
                                        hweVar = (hwe) k4.q();
                                    } else {
                                        throw new IllegalArgumentException("Not a double type");
                                    }
                                }
                            } else {
                                ljh k5 = hwe.e.k();
                                String str8 = flag.a;
                                if (!k5.b.y()) {
                                    k5.t();
                                }
                                ljn ljnVar5 = k5.b;
                                hwe hweVar8 = (hwe) ljnVar5;
                                str8.getClass();
                                hweVar8.a |= 1;
                                hweVar8.d = str8;
                                if (flag.g == 2) {
                                    boolean z2 = flag.c;
                                    if (!ljnVar5.y()) {
                                        k5.t();
                                    }
                                    hwe hweVar9 = (hwe) k5.b;
                                    hweVar9.b = 2;
                                    hweVar9.c = Boolean.valueOf(z2);
                                    hweVar = (hwe) k5.q();
                                } else {
                                    throw new IllegalArgumentException("Not a boolean type");
                                }
                            }
                        } else {
                            ljh k6 = hwe.e.k();
                            String str9 = flag.a;
                            if (!k6.b.y()) {
                                k6.t();
                            }
                            ljn ljnVar6 = k6.b;
                            hwe hweVar10 = (hwe) ljnVar6;
                            str9.getClass();
                            hweVar10.a |= 1;
                            hweVar10.d = str9;
                            if (flag.g == 1) {
                                long j2 = flag.b;
                                if (!ljnVar6.y()) {
                                    k6.t();
                                }
                                hwe hweVar11 = (hwe) k6.b;
                                hweVar11.b = 1;
                                hweVar11.c = Long.valueOf(j2);
                                hweVar = (hwe) k6.q();
                            } else {
                                throw new IllegalArgumentException("Not a long type");
                            }
                        }
                        if (!k.b.y()) {
                            k.t();
                        }
                        hwd hwdVar6 = (hwd) k.b;
                        hweVar.getClass();
                        ljv ljvVar = hwdVar6.e;
                        if (!ljvVar.c()) {
                            hwdVar6.e = ljn.p(ljvVar);
                        }
                        hwdVar6.e.add(hweVar);
                        i5++;
                        i3 = 2;
                        i = 1;
                        i2 = 4;
                    }
                    String[] strArr = configuration.c;
                    if (strArr != null) {
                        for (String str10 : strArr) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            hwd hwdVar7 = (hwd) k.b;
                            str10.getClass();
                            ljv ljvVar2 = hwdVar7.f;
                            if (!ljvVar2.c()) {
                                hwdVar7.f = ljn.p(ljvVar2);
                            }
                            hwdVar7.f.add(str10);
                        }
                    }
                    i4++;
                    i3 = 2;
                    i = 1;
                    i2 = 4;
                }
                return (hwd) k.q();
            }
        })), new jei() { // from class: hxv
            @Override // defpackage.jei
            public final Object a(Object obj2) {
                int i;
                long j;
                double d;
                String str2;
                lim limVar;
                hwd hwdVar = (hwd) obj2;
                ljh k = hxw.g.k();
                if (hwdVar == null) {
                    return (hxw) k.q();
                }
                for (hwe hweVar : hwdVar.e) {
                    ljh k2 = hxx.e.k();
                    String str3 = hweVar.d;
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    ljn ljnVar = k2.b;
                    hxx hxxVar = (hxx) ljnVar;
                    str3.getClass();
                    hxxVar.a |= 1;
                    hxxVar.d = str3;
                    int i2 = hweVar.b;
                    boolean z = false;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            i = 0;
                                        } else {
                                            i = 5;
                                        }
                                    } else {
                                        i = 4;
                                    }
                                } else {
                                    i = 3;
                                }
                            } else {
                                i = 2;
                            }
                        } else {
                            i = 1;
                        }
                    } else {
                        i = 6;
                    }
                    if (i != 0) {
                        int i3 = i - 1;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 != 3) {
                                        if (i3 == 4) {
                                            if (i2 == 5) {
                                                limVar = (lim) hweVar.c;
                                            } else {
                                                limVar = lim.b;
                                            }
                                            if (!k2.b.y()) {
                                                k2.t();
                                            }
                                            hxx hxxVar2 = (hxx) k2.b;
                                            limVar.getClass();
                                            hxxVar2.b = 6;
                                            hxxVar2.c = limVar;
                                        } else {
                                            throw new IllegalStateException("No known flag type");
                                        }
                                    } else {
                                        if (i2 == 4) {
                                            str2 = (String) hweVar.c;
                                        } else {
                                            str2 = "";
                                        }
                                        if (!ljnVar.y()) {
                                            k2.t();
                                        }
                                        hxx hxxVar3 = (hxx) k2.b;
                                        str2.getClass();
                                        hxxVar3.b = 5;
                                        hxxVar3.c = str2;
                                    }
                                } else {
                                    if (i2 == 3) {
                                        d = ((Double) hweVar.c).doubleValue();
                                    } else {
                                        d = 0.0d;
                                    }
                                    if (!k2.b.y()) {
                                        k2.t();
                                    }
                                    hxx hxxVar4 = (hxx) k2.b;
                                    hxxVar4.b = 4;
                                    hxxVar4.c = Double.valueOf(d);
                                }
                            } else {
                                if (i2 == 2) {
                                    z = ((Boolean) hweVar.c).booleanValue();
                                }
                                if (!k2.b.y()) {
                                    k2.t();
                                }
                                hxx hxxVar5 = (hxx) k2.b;
                                hxxVar5.b = 3;
                                hxxVar5.c = Boolean.valueOf(z);
                            }
                        } else {
                            if (i2 == 1) {
                                j = ((Long) hweVar.c).longValue();
                            } else {
                                j = 0;
                            }
                            if (!k2.b.y()) {
                                k2.t();
                            }
                            hxx hxxVar6 = (hxx) k2.b;
                            hxxVar6.b = 2;
                            hxxVar6.c = Long.valueOf(j);
                        }
                        hxx hxxVar7 = (hxx) k2.q();
                        if (!k.b.y()) {
                            k.t();
                        }
                        hxw hxwVar = (hxw) k.b;
                        hxxVar7.getClass();
                        ljv ljvVar = hxwVar.f;
                        if (!ljvVar.c()) {
                            hxwVar.f = ljn.p(ljvVar);
                        }
                        hxwVar.f.add(hxxVar7);
                    } else {
                        throw null;
                    }
                }
                String str4 = hwdVar.d;
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar2 = k.b;
                hxw hxwVar2 = (hxw) ljnVar2;
                str4.getClass();
                hxwVar2.a = 4 | hxwVar2.a;
                hxwVar2.d = str4;
                String str5 = hwdVar.b;
                if (!ljnVar2.y()) {
                    k.t();
                }
                ljn ljnVar3 = k.b;
                hxw hxwVar3 = (hxw) ljnVar3;
                str5.getClass();
                hxwVar3.a = 1 | hxwVar3.a;
                hxwVar3.b = str5;
                long j2 = hwdVar.h;
                if (!ljnVar3.y()) {
                    k.t();
                }
                ljn ljnVar4 = k.b;
                hxw hxwVar4 = (hxw) ljnVar4;
                hxwVar4.a |= 8;
                hxwVar4.e = j2;
                if ((hwdVar.a & 2) != 0) {
                    lim limVar2 = hwdVar.c;
                    if (!ljnVar4.y()) {
                        k.t();
                    }
                    hxw hxwVar5 = (hxw) k.b;
                    limVar2.getClass();
                    hxwVar5.a |= 2;
                    hxwVar5.c = limVar2;
                }
                return (hxw) k.q();
            }
        }, ((hvq) this.d).b());
    }

    public final jyz b(hxw hxwVar) {
        return ivc.I(new eyh(this, hxwVar, 9), ((hvq) this.d).b());
    }

    public final boolean c() {
        hxy hxyVar = ((hvq) this.d).d;
        if (this.a) {
            hwr b = hxyVar.b();
            if (b.b && new ljt(b.f, hwr.g).contains(knd.PROCESS_STABLE)) {
                return true;
            }
            return false;
        }
        hwq a = hxyVar.a();
        if (a.c && new ljt(a.h, hwq.i).contains(knd.PROCESS_STABLE)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024c  */
    /* JADX WARN: Type inference failed for: r1v27, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [jfe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kpb d() {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqm.d():kpb");
    }

    public bqm(Context context, jer jerVar, hul hulVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.d = context;
        this.e = hwx.H(new hnn(context, 9));
        this.a = ((Boolean) jerVar.e(false)).booleanValue();
        this.c = hulVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    public bqm(hvq hvqVar, String str, String str2, boolean z) {
        this.d = hvqVar;
        this.b = str;
        this.c = str2;
        this.a = z;
        ijy ijyVar = new ijy(hvqVar.c);
        ijyVar.d("phenotype");
        ijyVar.e(str2 + "/" + str + ".pb");
        if (z && a.g()) {
            ijyVar.b();
        }
        this.e = ijyVar.a();
    }
}
