package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import defpackage.eft;
import defpackage.ffc;
import defpackage.hmz;
import defpackage.hue;
import defpackage.huf;
import defpackage.huj;
import defpackage.huk;
import defpackage.huq;
import defpackage.hwx;
import defpackage.jfe;
import defpackage.jni;
import defpackage.jva;
import defpackage.jvb;
import defpackage.jvc;
import defpackage.jvd;
import defpackage.jwu;
import defpackage.jxd;
import defpackage.jxv;
import defpackage.jyv;
import defpackage.jyz;
import defpackage.lhv;
import defpackage.ljh;
import defpackage.ljj;
import defpackage.ljm;
import defpackage.ljn;
import defpackage.lju;
import defpackage.ljv;
import defpackage.lkh;
import defpackage.lla;
import defpackage.ndg;
import defpackage.ndh;
import defpackage.ndz;
import defpackage.nea;
import defpackage.nec;
import defpackage.ned;
import defpackage.nee;
import defpackage.ner;
import defpackage.ney;
import defpackage.nez;
import defpackage.nfe;
import defpackage.nqe;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClearcutMetricSnapshotTransmitter implements huf {
    public static final jfe a = hwx.H(new eft(13));
    public volatile ffc b;
    public volatile ffc c;
    private volatile huj d;
    private volatile huq e;
    private final jfe f = hwx.H(new eft(12));

    @Override // defpackage.huf
    public final jyz a(final Context context, hue hueVar) {
        String str;
        jvb jvbVar;
        nqe nqeVar = huk.j;
        hueVar.h(nqeVar);
        hwx.K(hueVar.l.m((ljm) nqeVar.d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new huq();
                }
            }
        }
        nfe nfeVar = hueVar.b;
        if (nfeVar == null) {
            nfeVar = nfe.v;
        }
        ljh ljhVar = (ljh) nfeVar.z(5);
        ljhVar.w(nfeVar);
        huq.b(huq.a, ljhVar);
        ndh ndhVar = ((nfe) ljhVar.b).i;
        if (ndhVar == null) {
            ndhVar = ndh.c;
        }
        if ((ndhVar.a & 1) != 0) {
            ndh ndhVar2 = ((nfe) ljhVar.b).i;
            if (ndhVar2 == null) {
                ndhVar2 = ndh.c;
            }
            ndg ndgVar = ndhVar2.b;
            if (ndgVar == null) {
                ndgVar = ndg.l;
            }
            ljh ljhVar2 = (ljh) ndgVar.z(5);
            ljhVar2.w(ndgVar);
            huq.b(huq.b, ljhVar2);
            ndh ndhVar3 = ((nfe) ljhVar.b).i;
            if (ndhVar3 == null) {
                ndhVar3 = ndh.c;
            }
            ljh ljhVar3 = (ljh) ndhVar3.z(5);
            ljhVar3.w(ndhVar3);
            if (!ljhVar3.b.y()) {
                ljhVar3.t();
            }
            ndh ndhVar4 = (ndh) ljhVar3.b;
            ndg ndgVar2 = (ndg) ljhVar2.q();
            ndgVar2.getClass();
            ndhVar4.b = ndgVar2;
            ndhVar4.a |= 1;
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            nfe nfeVar2 = (nfe) ljhVar.b;
            ndh ndhVar5 = (ndh) ljhVar3.q();
            ndhVar5.getClass();
            nfeVar2.i = ndhVar5;
            nfeVar2.a |= 256;
        }
        ner nerVar = ((nfe) ljhVar.b).g;
        if (nerVar == null) {
            nerVar = ner.k;
        }
        if ((nerVar.a & 256) != 0) {
            ner nerVar2 = ((nfe) ljhVar.b).g;
            if (nerVar2 == null) {
                nerVar2 = ner.k;
            }
            jvd jvdVar = nerVar2.h;
            if (jvdVar == null) {
                jvdVar = jvd.f;
            }
            ljh ljhVar4 = (ljh) jvdVar.z(5);
            ljhVar4.w(jvdVar);
            jva jvaVar = ((jvd) ljhVar4.b).d;
            if (jvaVar == null) {
                jvaVar = jva.f;
            }
            jva c = huq.c(jvaVar);
            if (!ljhVar4.b.y()) {
                ljhVar4.t();
            }
            jvd jvdVar2 = (jvd) ljhVar4.b;
            c.getClass();
            jvdVar2.d = c;
            jvdVar2.a |= 1;
            List unmodifiableList = Collections.unmodifiableList(jvdVar2.e);
            if (!ljhVar4.b.y()) {
                ljhVar4.t();
            }
            ((jvd) ljhVar4.b).e = lla.a;
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                jva c2 = huq.c((jva) it.next());
                if (!ljhVar4.b.y()) {
                    ljhVar4.t();
                }
                jvd jvdVar3 = (jvd) ljhVar4.b;
                c2.getClass();
                jvdVar3.b();
                jvdVar3.e.add(c2);
            }
            jvd jvdVar4 = (jvd) ljhVar4.b;
            if (jvdVar4.b == 4) {
                jvbVar = (jvb) jvdVar4.c;
            } else {
                jvbVar = jvb.b;
            }
            ljv<jvc> ljvVar = jvbVar.a;
            ljh k = jvb.b.k();
            for (jvc jvcVar : ljvVar) {
                jva jvaVar2 = jvcVar.b;
                if (jvaVar2 == null) {
                    jvaVar2 = jva.f;
                }
                if ((jvaVar2.a & 2) != 0) {
                    ljh ljhVar5 = (ljh) jvcVar.z(5);
                    ljhVar5.w(jvcVar);
                    jva c3 = huq.c(jvaVar2);
                    if (!ljhVar5.b.y()) {
                        ljhVar5.t();
                    }
                    jvc jvcVar2 = (jvc) ljhVar5.b;
                    c3.getClass();
                    jvcVar2.b = c3;
                    jvcVar2.a |= 1;
                    jvcVar = (jvc) ljhVar5.q();
                }
                if (!k.b.y()) {
                    k.t();
                }
                jvb jvbVar2 = (jvb) k.b;
                jvcVar.getClass();
                jvbVar2.b();
                jvbVar2.a.add(jvcVar);
            }
            jvb jvbVar3 = (jvb) k.q();
            if (!ljhVar4.b.y()) {
                ljhVar4.t();
            }
            jvd jvdVar5 = (jvd) ljhVar4.b;
            jvbVar3.getClass();
            jvdVar5.c = jvbVar3;
            jvdVar5.b = 4;
            ner nerVar3 = ((nfe) ljhVar.b).g;
            if (nerVar3 == null) {
                nerVar3 = ner.k;
            }
            ljh ljhVar6 = (ljh) nerVar3.z(5);
            ljhVar6.w(nerVar3);
            jvd jvdVar6 = (jvd) ljhVar4.q();
            if (!ljhVar6.b.y()) {
                ljhVar6.t();
            }
            ner nerVar4 = (ner) ljhVar6.b;
            jvdVar6.getClass();
            nerVar4.h = jvdVar6;
            nerVar4.a |= 256;
            ner nerVar5 = (ner) ljhVar6.q();
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            nfe nfeVar3 = (nfe) ljhVar.b;
            nerVar5.getClass();
            nfeVar3.g = nerVar5;
            nfeVar3.a |= 64;
        }
        nez nezVar = ((nfe) ljhVar.b).h;
        if (nezVar == null) {
            nezVar = nez.k;
        }
        boolean z = false;
        if (nezVar.j.size() != 0) {
            nez nezVar2 = ((nfe) ljhVar.b).h;
            if (nezVar2 == null) {
                nezVar2 = nez.k;
            }
            ljh ljhVar7 = (ljh) nezVar2.z(5);
            ljhVar7.w(nezVar2);
            for (int i = 0; i < ((nez) ljhVar7.b).j.size(); i++) {
                ney neyVar = (ney) ((nez) ljhVar7.b).j.get(i);
                ljh ljhVar8 = (ljh) neyVar.z(5);
                ljhVar8.w(neyVar);
                if (!((ney) ljhVar8.b).b.isEmpty()) {
                    if (!ljhVar8.b.y()) {
                        ljhVar8.t();
                    }
                    ((ney) ljhVar8.b).c = lkh.a;
                    List a2 = huq.a(((ney) ljhVar8.b).b);
                    if (!ljhVar8.b.y()) {
                        ljhVar8.t();
                    }
                    ney neyVar2 = (ney) ljhVar8.b;
                    lju ljuVar = neyVar2.c;
                    if (!ljuVar.c()) {
                        neyVar2.c = ljn.o(ljuVar);
                    }
                    lhv.g(a2, neyVar2.c);
                }
                if (!ljhVar8.b.y()) {
                    ljhVar8.t();
                }
                ney neyVar3 = (ney) ljhVar8.b;
                neyVar3.a &= -2;
                neyVar3.b = ney.d.b;
                if (!ljhVar7.b.y()) {
                    ljhVar7.t();
                }
                nez nezVar3 = (nez) ljhVar7.b;
                ney neyVar4 = (ney) ljhVar8.q();
                neyVar4.getClass();
                ljv ljvVar2 = nezVar3.j;
                if (!ljvVar2.c()) {
                    nezVar3.j = ljn.p(ljvVar2);
                }
                nezVar3.j.set(i, neyVar4);
            }
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            nfe nfeVar4 = (nfe) ljhVar.b;
            nez nezVar4 = (nez) ljhVar7.q();
            nezVar4.getClass();
            nfeVar4.h = nezVar4;
            nfeVar4.a |= 128;
        }
        nea neaVar = ((nfe) ljhVar.b).f;
        if (neaVar == null) {
            neaVar = nea.c;
        }
        if (neaVar.a.size() != 0) {
            nea neaVar2 = ((nfe) ljhVar.b).f;
            if (neaVar2 == null) {
                neaVar2 = nea.c;
            }
            ljh ljhVar9 = (ljh) neaVar2.z(5);
            ljhVar9.w(neaVar2);
            for (int i2 = 0; i2 < ((nea) ljhVar9.b).a.size(); i2++) {
                ndz ndzVar = (ndz) ((nea) ljhVar9.b).a.get(i2);
                ljh ljhVar10 = (ljh) ndzVar.z(5);
                ljhVar10.w(ndzVar);
                if (!((ndz) ljhVar10.b).t.isEmpty()) {
                    if (!ljhVar10.b.y()) {
                        ljhVar10.t();
                    }
                    ((ndz) ljhVar10.b).u = lkh.a;
                    List a3 = huq.a(((ndz) ljhVar10.b).t);
                    if (!ljhVar10.b.y()) {
                        ljhVar10.t();
                    }
                    ndz ndzVar2 = (ndz) ljhVar10.b;
                    lju ljuVar2 = ndzVar2.u;
                    if (!ljuVar2.c()) {
                        ndzVar2.u = ljn.o(ljuVar2);
                    }
                    lhv.g(a3, ndzVar2.u);
                }
                if (!ljhVar10.b.y()) {
                    ljhVar10.t();
                }
                ndz ndzVar3 = (ndz) ljhVar10.b;
                ndzVar3.a &= -524289;
                ndzVar3.t = ndz.D.t;
                if (!ljhVar9.b.y()) {
                    ljhVar9.t();
                }
                nea neaVar3 = (nea) ljhVar9.b;
                ndz ndzVar4 = (ndz) ljhVar10.q();
                ndzVar4.getClass();
                neaVar3.c();
                neaVar3.a.set(i2, ndzVar4);
            }
            for (int i3 = 0; i3 < ((nea) ljhVar9.b).b.size(); i3++) {
                nec necVar = (nec) ((nea) ljhVar9.b).b.get(i3);
                ljh ljhVar11 = (ljh) necVar.z(5);
                ljhVar11.w(necVar);
                if (!((nec) ljhVar11.b).b.isEmpty()) {
                    if (!ljhVar11.b.y()) {
                        ljhVar11.t();
                    }
                    ((nec) ljhVar11.b).c = lkh.a;
                    List a4 = huq.a(((nec) ljhVar11.b).b);
                    if (!ljhVar11.b.y()) {
                        ljhVar11.t();
                    }
                    nec necVar2 = (nec) ljhVar11.b;
                    lju ljuVar3 = necVar2.c;
                    if (!ljuVar3.c()) {
                        necVar2.c = ljn.o(ljuVar3);
                    }
                    lhv.g(a4, necVar2.c);
                }
                if (!ljhVar11.b.y()) {
                    ljhVar11.t();
                }
                nec necVar3 = (nec) ljhVar11.b;
                necVar3.a &= -2;
                necVar3.b = nec.d.b;
                if (!ljhVar9.b.y()) {
                    ljhVar9.t();
                }
                nea neaVar4 = (nea) ljhVar9.b;
                nec necVar4 = (nec) ljhVar11.q();
                necVar4.getClass();
                ljv ljvVar3 = neaVar4.b;
                if (!ljvVar3.c()) {
                    neaVar4.b = ljn.p(ljvVar3);
                }
                neaVar4.b.set(i3, necVar4);
            }
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            nfe nfeVar5 = (nfe) ljhVar.b;
            nea neaVar5 = (nea) ljhVar9.q();
            neaVar5.getClass();
            nfeVar5.f = neaVar5;
            nfeVar5.a |= 32;
        }
        ned nedVar = ((nfe) ljhVar.b).k;
        if (nedVar == null) {
            nedVar = ned.f;
        }
        if (nedVar.d.size() != 0) {
            ned nedVar2 = ((nfe) ljhVar.b).k;
            if (nedVar2 == null) {
                nedVar2 = ned.f;
            }
            ljh ljhVar12 = (ljh) nedVar2.z(5);
            ljhVar12.w(nedVar2);
            for (int i4 = 0; i4 < ((ned) ljhVar12.b).d.size(); i4++) {
                nee neeVar = (nee) ((ned) ljhVar12.b).d.get(i4);
                ljh ljhVar13 = (ljh) neeVar.z(5);
                ljhVar13.w(neeVar);
                ljj ljjVar = (ljj) ljhVar13;
                huq.b(huq.c, ljjVar);
                if (!ljhVar12.b.y()) {
                    ljhVar12.t();
                }
                ned nedVar3 = (ned) ljhVar12.b;
                nee neeVar2 = (nee) ljjVar.q();
                neeVar2.getClass();
                ljv ljvVar4 = nedVar3.d;
                if (!ljvVar4.c()) {
                    nedVar3.d = ljn.p(ljvVar4);
                }
                nedVar3.d.set(i4, neeVar2);
            }
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            nfe nfeVar6 = (nfe) ljhVar.b;
            ned nedVar4 = (ned) ljhVar12.q();
            nedVar4.getClass();
            nfeVar6.k = nedVar4;
            nfeVar6.a |= 2048;
        }
        final nfe nfeVar7 = (nfe) ljhVar.q();
        if (((jni) hmz.a.d()).C()) {
            int i5 = nfeVar7.a;
            if ((4194304 & i5) == 0) {
                str = null;
            } else {
                str = "primes stats";
            }
            int i6 = i5 & 32;
            int i7 = i5 & 16;
            int i8 = i5 & 8;
            int i9 = i5 & 256;
            int i10 = i5 & 64;
            int i11 = i5 & 1024;
            int i12 = i5 & 128;
            int i13 = i5 & 2048;
            if (i6 != 0) {
                str = "network metric";
            }
            if (i7 != 0) {
                str = "timer metric";
            }
            if (i8 != 0) {
                str = "memory metric";
            }
            if (i9 != 0) {
                str = "battery metric";
            }
            if (i10 != 0) {
                str = "crash metric";
            }
            if (i11 != 0) {
                str = "jank metric";
            }
            if (i12 != 0) {
                str = "package metric";
            }
            if (i13 != 0) {
                str = "trace";
            }
            jni jniVar = (jni) ((jni) hmz.a.d()).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "logSystemHealthMetric", 219, "ClearcutMetricSnapshotTransmitter.java");
            if (str == null) {
                str = "unknown";
            }
            jniVar.y("Sending Primes %s: %s", str, nfeVar7);
        }
        if (((Boolean) this.f.a()).booleanValue()) {
            return jyv.a;
        }
        nqe nqeVar2 = huk.j;
        hueVar.h(nqeVar2);
        Object k2 = hueVar.l.k((ljm) nqeVar2.d);
        if (k2 == null) {
            k2 = nqeVar2.a;
        } else {
            nqeVar2.h(k2);
        }
        final huk hukVar = (huk) k2;
        if (((jni) hmz.a.d()).C()) {
            ((jni) ((jni) hmz.a.d()).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "transmit", 119, "ClearcutMetricSnapshotTransmitter.java")).u("%s", Base64.encodeToString(nfeVar7.g(), 2));
        }
        boolean z2 = hukVar.h;
        if ((nfeVar7.a & 64) != 0) {
            z = true;
        }
        huj hujVar = this.d;
        if (hujVar == null) {
            synchronized (this) {
                hujVar = this.d;
                if (hujVar == null) {
                    hujVar = new huj();
                    this.d = hujVar;
                }
            }
        }
        return jwu.h(hujVar.a(context, z2, true ^ z), new jxd() { // from class: hun
            @Override // defpackage.jxd
            public final jyz a(Object obj) {
                ffc ffcVar;
                if (((Boolean) obj).booleanValue()) {
                    huk hukVar2 = hukVar;
                    Context context2 = context;
                    ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = ClearcutMetricSnapshotTransmitter.this;
                    String str2 = hukVar2.b;
                    if (hukVar2.d) {
                        ffcVar = clearcutMetricSnapshotTransmitter.c;
                        if (ffcVar == null) {
                            synchronized (clearcutMetricSnapshotTransmitter) {
                                ffcVar = clearcutMetricSnapshotTransmitter.c;
                                if (ffcVar == null) {
                                    ffc i14 = ffc.i(context2, str2);
                                    clearcutMetricSnapshotTransmitter.c = i14;
                                    ffcVar = i14;
                                }
                            }
                        }
                    } else {
                        ffcVar = clearcutMetricSnapshotTransmitter.b;
                        if (ffcVar == null) {
                            synchronized (clearcutMetricSnapshotTransmitter) {
                                ffcVar = clearcutMetricSnapshotTransmitter.b;
                                if (ffcVar == null) {
                                    ffc a5 = new fex(context2, str2).a();
                                    clearcutMetricSnapshotTransmitter.b = a5;
                                    ffcVar = a5;
                                }
                            }
                        }
                    }
                    ffb g = ffcVar.g(nfeVar7);
                    if (lxl.a.a().a(context2)) {
                        g.q = fzz.b(context2, (fzj) ClearcutMetricSnapshotTransmitter.a.a());
                    }
                    if (!hukVar2.d) {
                        String str3 = hukVar2.e;
                        if (!ivc.o(str3)) {
                            if (!g.a.e()) {
                                ljj ljjVar2 = g.p;
                                if (!ljjVar2.b.y()) {
                                    ljjVar2.t();
                                }
                                lnz lnzVar = (lnz) ljjVar2.b;
                                lnz lnzVar2 = lnz.k;
                                str3.getClass();
                                lnzVar.a |= 16777216;
                                lnzVar.i = str3;
                            } else {
                                throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                            }
                        }
                        if ((hukVar2.a & 2) != 0) {
                            g.f(hukVar2.c);
                        }
                        if ((hukVar2.a & 16) != 0) {
                            g.h(hukVar2.f);
                        }
                        ljr ljrVar = hukVar2.g;
                        if (!ljrVar.isEmpty()) {
                            g.e(iqh.q(ljrVar));
                        }
                    }
                    return fzo.b(fma.aT(g.c()));
                }
                return jyv.a;
            }
        }, jxv.a);
    }
}
