package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpd {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public hpd(cce cceVar, List list, ddh ddhVar, msw mswVar) {
        this.b = cceVar;
        this.e = ddhVar;
        this.a = mswVar;
        mwo mwoVar = new mwo(new bea(this, (mmx) null, 6, (char[]) null));
        int i = myk.a;
        long j = mrl.a;
        myr myrVar = new myr(mrl.a(0L), mrl.a(0L));
        myi t = mpd.t(mwoVar, 0);
        int i2 = t.b;
        int i3 = t.d;
        if (i2 < 0) {
            throw new IllegalArgumentException(a.ae(i2, "extraBufferCapacity cannot be negative, but was "));
        }
        if (i2 <= 0 && i3 != 1) {
            Objects.toString(mkm.av(2));
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(mkm.av(2)));
        }
        mye myeVar = new mye(0, i2, i3);
        mpd.v(mswVar, t.c, t.a, myeVar, myrVar, myf.a);
        this.c = new mxz(myeVar);
        this.f = new mwo(new cbc(this, null));
        this.i = new mwr(new cbk(this, (mmx) null, 1, (byte[]) null), mnc.a, -2, 1);
        this.j = new ddh((char[]) null, (byte[]) null);
        this.g = new cby(this, list);
        this.d = new mla(new azp(this, 13));
        this.h = new mla(new azp(this, 12));
        this.k = new eld(mswVar, new bco(this, 8), cbj.a, new cbk(this, (mmx) null, 0));
    }

    private final Object p(mol molVar, mnb mnbVar, mmx mmxVar) {
        return n().f(new cbh(this, mnbVar, molVar, (mmx) null, 0), mmxVar);
    }

    public final long a(String str) {
        if (((hnb) this.a).a) {
            return -1L;
        }
        htu htuVar = (htu) this.e;
        hts htsVar = htuVar.c;
        int intValue = ((Integer) htsVar.b.a()).intValue();
        if (intValue == 0) {
            return -1L;
        }
        if (intValue != Integer.MAX_VALUE) {
            synchronized (htsVar.a) {
                if (htsVar.c >= intValue) {
                    long j = htsVar.d;
                    fma fmaVar = htsVar.e;
                    if (SystemClock.elapsedRealtime() - j <= 1000) {
                        return -1L;
                    }
                }
            }
        }
        boolean z = htuVar.b;
        htz htzVar = htuVar.a;
        if (!z) {
            return -1L;
        }
        return htzVar.a(str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final jyz b(final hoz hozVar) {
        if (((hnb) this.a).a) {
            return ivc.C();
        }
        return ivc.J(new jxc() { // from class: hpc
            /* JADX WARN: Type inference failed for: r0v4, types: [jfe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v33, types: [mko, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r11v32, types: [mko, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r13v6, types: [jfe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v18, types: [mko, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v43, types: [mko, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v22, types: [jfe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v4, types: [mko, java.lang.Object] */
            @Override // defpackage.jxc
            public final jyz a() {
                nfd d;
                Object obj;
                nfe nfeVar;
                jyz h;
                int i;
                hpd hpdVar = hpd.this;
                hoz hozVar2 = hozVar;
                if (hozVar2.g) {
                    ljh k = nfd.d.k();
                    if (!k.b.y()) {
                        k.t();
                    }
                    nfd nfdVar = (nfd) k.b;
                    nfdVar.c = 2;
                    nfdVar.a |= 4;
                    d = (nfd) k.q();
                } else {
                    Long l = hozVar2.f;
                    htu htuVar = (htu) hpdVar.e;
                    boolean z = htuVar.b;
                    htz htzVar = htuVar.a;
                    if (z) {
                        d = htzVar.b(l);
                    } else {
                        d = htzVar.d();
                    }
                }
                if (d.b == -1) {
                    return jyv.a;
                }
                hph hphVar = (hph) hpdVar.c.a();
                nfe nfeVar2 = hozVar2.c;
                int i2 = 5;
                ljh ljhVar = (ljh) nfeVar2.z(5);
                ljhVar.w(nfeVar2);
                ljh k2 = nen.g.k();
                int i3 = hphVar.a;
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar = k2.b;
                nen nenVar = (nen) ljnVar;
                nenVar.d = i3 - 1;
                nenVar.a |= 4;
                Object obj2 = hphVar.c;
                if (obj2 != null) {
                    if (!ljnVar.y()) {
                        k2.t();
                    }
                    nen nenVar2 = (nen) k2.b;
                    nenVar2.a |= 1;
                    nenVar2.b = (String) obj2;
                }
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar2 = k2.b;
                nen nenVar3 = (nen) ljnVar2;
                nenVar3.a |= 8;
                nenVar3.e = 647465502L;
                Object obj3 = hphVar.e;
                if (obj3 != null) {
                    if (!ljnVar2.y()) {
                        k2.t();
                    }
                    nen nenVar4 = (nen) k2.b;
                    nenVar4.a |= 2;
                    nenVar4.c = (String) obj3;
                }
                ndv ndvVar = nfeVar2.e;
                if (ndvVar == null) {
                    ndvVar = ndv.g;
                }
                nek nekVar = ndvVar.c;
                if (nekVar == null) {
                    nekVar = nek.c;
                }
                nej nejVar = nekVar.b;
                if (nejVar == null) {
                    nejVar = nej.h;
                }
                if ((nejVar.a & 8) != 0 && ((Boolean) hphVar.h.a()).booleanValue()) {
                    Object obj4 = hphVar.c;
                    ndv ndvVar2 = nfeVar2.e;
                    if (ndvVar2 == null) {
                        ndvVar2 = ndv.g;
                    }
                    nek nekVar2 = ndvVar2.c;
                    if (nekVar2 == null) {
                        nekVar2 = nek.c;
                    }
                    nej nejVar2 = nekVar2.b;
                    if (nejVar2 == null) {
                        nejVar2 = nej.h;
                    }
                    obj = hoa.c((String) obj4, nejVar2.e);
                } else {
                    obj = hphVar.d;
                }
                if (obj != null) {
                    if (!k2.b.y()) {
                        k2.t();
                    }
                    nen nenVar5 = (nen) k2.b;
                    nenVar5.a |= 16;
                    nenVar5.f = (String) obj;
                }
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                nfe nfeVar3 = (nfe) ljhVar.b;
                nen nenVar6 = (nen) k2.q();
                nenVar6.getClass();
                nfeVar3.q = nenVar6;
                nfeVar3.a |= 2097152;
                if (gad.d((Context) hphVar.b)) {
                    ljh k3 = nev.d.k();
                    long freeSpace = ((ksr) hphVar.f).f().getFreeSpace() / 1024;
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    nev nevVar = (nev) k3.b;
                    nevVar.a |= 1;
                    nevVar.b = freeSpace;
                    long longValue = ((Long) hphVar.g.a()).longValue();
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    nev nevVar2 = (nev) k3.b;
                    nevVar2.a |= 2;
                    nevVar2.c = longValue;
                    if (!ljhVar.b.y()) {
                        ljhVar.t();
                    }
                    nfe nfeVar4 = (nfe) ljhVar.b;
                    nev nevVar3 = (nev) k3.q();
                    nevVar3.getClass();
                    nfeVar4.s = nevVar3;
                    nfeVar4.a |= 8388608;
                }
                byte[] bArr = null;
                if (!TextUtils.isEmpty(null)) {
                    nem nemVar = nfeVar2.u;
                    if (nemVar == null) {
                        nemVar = nem.c;
                    }
                    ljh ljhVar2 = (ljh) nemVar.z(5);
                    ljhVar2.w(nemVar);
                    if (((nem) ljhVar2.b).b.isEmpty()) {
                        if (!ljhVar2.b.y()) {
                            ljhVar2.t();
                        }
                        throw null;
                    }
                    String str = ((String) null) + "::" + ((nem) ljhVar2.b).b;
                    if (!ljhVar2.b.y()) {
                        ljhVar2.t();
                    }
                    nem nemVar2 = (nem) ljhVar2.b;
                    nemVar2.a |= 1;
                    nemVar2.b = str;
                    if (!ljhVar.b.y()) {
                        ljhVar.t();
                    }
                    nfe nfeVar5 = (nfe) ljhVar.b;
                    nem nemVar3 = (nem) ljhVar2.q();
                    nemVar3.getClass();
                    nfeVar5.u = nemVar3;
                    nfeVar5.a |= 33554432;
                }
                nfe nfeVar6 = (nfe) ljhVar.q();
                ljh ljhVar3 = (ljh) nfeVar6.z(5);
                ljhVar3.w(nfeVar6);
                if (!ljhVar3.b.y()) {
                    ljhVar3.t();
                }
                nfe nfeVar7 = (nfe) ljhVar3.b;
                d.getClass();
                nfeVar7.n = d;
                nfeVar7.a |= ImageMetadata.LENS_APERTURE;
                int i4 = 13;
                if (hozVar2.h != null && ((jer) hpdVar.g).g()) {
                    int i5 = hozVar2.i;
                    ((Boolean) hpdVar.i.a()).booleanValue();
                    ArrayList arrayList = new ArrayList();
                    Collections.sort(arrayList, new bfr(13));
                    ljh k4 = neu.a.k();
                    int max = Math.max(arrayList.size() - i5, 0);
                    if (max >= arrayList.size()) {
                        neu neuVar = new hne((neu) k4.q()).a;
                        if (!ljhVar3.b.y()) {
                            ljhVar3.t();
                        }
                        nfe nfeVar8 = (nfe) ljhVar3.b;
                        nfeVar8.o = neuVar;
                        nfeVar8.a |= ImageMetadata.SHADING_MODE;
                    } else {
                        Object obj5 = ((hnu) arrayList.get(max)).a;
                        throw null;
                    }
                }
                if (((jer) hpdVar.j).g() && (hozVar2.c.a & 64) != 0 && ((Boolean) hpdVar.k.a()).booleanValue()) {
                    List K = hzc.K(((htd) ((jer) hpdVar.j).c()).a(), new hkn(8));
                    if (!ljhVar3.b.y()) {
                        ljhVar3.t();
                    }
                    nfe nfeVar9 = (nfe) ljhVar3.b;
                    ljv ljvVar = nfeVar9.l;
                    if (!ljvVar.c()) {
                        nfeVar9.l = ljn.p(ljvVar);
                    }
                    lhv.g(K, nfeVar9.l);
                }
                jer jerVar = (jer) hpdVar.h;
                if (jerVar.g()) {
                    jis a = ((hox) jerVar.c()).a();
                    if (!ljhVar3.b.y()) {
                        ljhVar3.t();
                    }
                    nfe nfeVar10 = (nfe) ljhVar3.b;
                    ljv ljvVar2 = nfeVar10.p;
                    if (!ljvVar2.c()) {
                        nfeVar10.p = ljn.p(ljvVar2);
                    }
                    lhv.g(a, nfeVar10.p);
                }
                String str2 = hozVar2.a;
                if (hozVar2.b) {
                    if (str2 != null) {
                        if (!ljhVar3.b.y()) {
                            ljhVar3.t();
                        }
                        nfe nfeVar11 = (nfe) ljhVar3.b;
                        nfeVar11.a |= 4;
                        nfeVar11.d = str2;
                    } else {
                        if (!ljhVar3.b.y()) {
                            ljhVar3.t();
                        }
                        nfe nfeVar12 = (nfe) ljhVar3.b;
                        nfeVar12.a &= -5;
                        nfeVar12.d = nfe.v.d;
                    }
                } else if (str2 != null) {
                    if (!ljhVar3.b.y()) {
                        ljhVar3.t();
                    }
                    nfe nfeVar13 = (nfe) ljhVar3.b;
                    nfeVar13.a = 2 | nfeVar13.a;
                    nfeVar13.c = str2;
                } else {
                    if (!ljhVar3.b.y()) {
                        ljhVar3.t();
                    }
                    nfe nfeVar14 = (nfe) ljhVar3.b;
                    nfeVar14.a &= -3;
                    nfeVar14.c = nfe.v.c;
                }
                hpdVar.f.a();
                ndq ndqVar = hozVar2.d;
                if (ndqVar != null) {
                    if (!ljhVar3.b.y()) {
                        ljhVar3.t();
                    }
                    nfe nfeVar15 = (nfe) ljhVar3.b;
                    nfeVar15.t = ndqVar;
                    nfeVar15.a |= 16777216;
                }
                String str3 = hozVar2.e;
                if (str3 != null) {
                    ljh k5 = nem.c.k();
                    if (!k5.b.y()) {
                        k5.t();
                    }
                    nem nemVar4 = (nem) k5.b;
                    nemVar4.a |= 1;
                    nemVar4.b = str3;
                    if (!ljhVar3.b.y()) {
                        ljhVar3.t();
                    }
                    nfe nfeVar16 = (nfe) ljhVar3.b;
                    nem nemVar5 = (nem) k5.q();
                    nemVar5.getClass();
                    nfeVar16.u = nemVar5;
                    nfeVar16.a |= 33554432;
                }
                Object obj6 = hpdVar.b;
                nfe nfeVar17 = (nfe) ljhVar3.q();
                jis jisVar = (jis) ((hpa) obj6).a.a();
                jin j = jis.j(jisVar.size());
                int size = jisVar.size();
                RuntimeException runtimeException = null;
                int i6 = 0;
                while (i6 < size) {
                    bqm bqmVar = (bqm) jisVar.get(i6);
                    try {
                    } catch (RuntimeException e) {
                        e = e;
                    }
                    if (bqmVar.a) {
                        ner nerVar = nfeVar17.g;
                        if (nerVar == null) {
                            nerVar = ner.k;
                        }
                        if ((nerVar.a & 1) != 0) {
                            h = jwu.g(((hul) bqmVar.c).a(), new emc(bqmVar, nfeVar17, i4, bArr), jxv.a);
                            j.h(h);
                            i6++;
                            bArr = null;
                            i4 = 13;
                            i2 = 5;
                        }
                    }
                    if ((nfeVar17.a & 1024) != 0 && ((Boolean) bqmVar.e.a()).booleanValue()) {
                        ljh ljhVar4 = (ljh) nfeVar17.z(i2);
                        ljhVar4.w(nfeVar17);
                        nex nexVar = nfeVar17.j;
                        if (nexVar == null) {
                            nexVar = nex.o;
                        }
                        ljv<Cnew> ljvVar3 = nexVar.j;
                        if (!ljvVar3.isEmpty()) {
                            ljh k6 = nfa.c.k();
                            Cnew cnew = null;
                            for (Cnew cnew2 : ljvVar3) {
                                if (cnew != null && (i = cnew.d + 1) != cnew2.c) {
                                    k6.al(0);
                                    k6.ak(i);
                                }
                                k6.al(cnew2.b);
                                k6.ak(cnew2.c);
                                cnew = cnew2;
                            }
                            if (cnew != null && (cnew.a & 4) != 0) {
                                int i7 = cnew.d + 1;
                                k6.al(0);
                                k6.ak(i7);
                            }
                            try {
                                ljh ljhVar5 = (ljh) nexVar.z(5);
                                ljhVar5.w(nexVar);
                                if (!ljhVar5.b.y()) {
                                    ljhVar5.t();
                                }
                                ((nex) ljhVar5.b).j = lla.a;
                                if (!ljhVar5.b.y()) {
                                    ljhVar5.t();
                                }
                                nex nexVar2 = (nex) ljhVar5.b;
                                nfa nfaVar = (nfa) k6.q();
                                nfaVar.getClass();
                                nexVar2.i = nfaVar;
                                nexVar2.a |= 128;
                                nexVar = (nex) ljhVar5.q();
                            } catch (RuntimeException e2) {
                                e = e2;
                                ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", 'I', "MetricDispatcher.java")).r("One transmitter failed to send message");
                                if (runtimeException == null) {
                                    runtimeException = e;
                                } else {
                                    runtimeException.addSuppressed(e);
                                }
                                i6++;
                                bArr = null;
                                i4 = 13;
                                i2 = 5;
                            }
                        }
                        if (!ljhVar4.b.y()) {
                            ljhVar4.t();
                        }
                        nfe nfeVar18 = (nfe) ljhVar4.b;
                        nexVar.getClass();
                        nfeVar18.j = nexVar;
                        nfeVar18.a |= 1024;
                        nfeVar = (nfe) ljhVar4.q();
                    } else {
                        nfeVar = nfeVar17;
                    }
                    h = jwu.h(((hul) bqmVar.c).a(), new ejc(bqmVar, nfeVar, 19), jxv.a);
                    j.h(h);
                    i6++;
                    bArr = null;
                    i4 = 13;
                    i2 = 5;
                }
                if (runtimeException == null) {
                    jyz a2 = ivc.S(j.g()).a(new hxl(1), jxv.a);
                    hts htsVar = ((htu) hpdVar.e).c;
                    fma fmaVar = htsVar.e;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    synchronized (htsVar.a) {
                        htsVar.c++;
                        if (elapsedRealtime - htsVar.d > 1000) {
                            htsVar.c = 0;
                            htsVar.d = elapsedRealtime;
                        }
                    }
                    return a2;
                }
                throw runtimeException;
            }
        }, this.d);
    }

    public final boolean c(String str) {
        if (a(str) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map, java.lang.Object] */
    public final gfn d(Account account) {
        gfn gfnVar;
        synchronized (this.d) {
            if (!this.f.containsKey(account)) {
                ?? r9 = this.f;
                ijy ijyVar = new ijy((Context) this.b);
                ijyVar.a = "com.google.android.gms";
                ijyVar.c("managed");
                ijyVar.d("mdisync");
                ijw.a(account);
                ijyVar.b = account;
                ijyVar.e("profilesync/public/profile_info.pb");
                Uri a = ijyVar.a();
                Object obj = this.g;
                ilt a2 = ilu.a();
                a2.b = new ilw((ilk) this.h);
                a2.c(gfs.c);
                a2.d(a);
                ddg ddgVar = new ddg(((ilv) obj).a(a2.a()));
                byte[] bArr = null;
                gok gokVar = new gok(this.c, this.j, (byte[]) null);
                AtomicReference atomicReference = new AtomicReference(new gft() { // from class: gfo
                    @Override // defpackage.gft
                    public final void f() {
                    }
                });
                AtomicReference atomicReference2 = new AtomicReference(new gfu() { // from class: gfp
                    @Override // defpackage.gfu
                    public final void g() {
                    }
                });
                enj enjVar = new enj(atomicReference, 9);
                enj enjVar2 = new enj(atomicReference2, 10);
                gok gokVar2 = new gok((Context) this.b, new fsl((Context) this.b, new fsh(account)), account, enjVar, enjVar2);
                int i = 8;
                int i2 = 0;
                if (lwh.a.a().b((Context) this.b)) {
                    gfh.a(((Context) this.b).getApplicationContext());
                    Object obj2 = this.k;
                    fjy fjyVar = new fjy();
                    fjyVar.a = new fun(i);
                    fjyVar.c = 3901;
                    jer.i(jwu.g(jwu.g(fzo.b(((fhq) obj2).f(fjyVar.a())), new gfa(6), jxv.a), new gfa(i2), jxv.a));
                } else {
                    gfh.a(((Context) this.b).getApplicationContext());
                    jer.i(new gez(account.toString(), 0));
                }
                gfn gfnVar2 = new gfn(gokVar2, (Context) this.b, gokVar, ddgVar, new apc((jfe) new enj(this.e, i), new ddg((char[]) null), gfh.a(((Context) this.b).getApplicationContext())), new hjq(this, a, bArr));
                gfnVar2.e(new gfq(this, a), jxv.a);
                atomicReference.set(gfnVar2);
                atomicReference2.set(gfnVar2);
                r9.put(account, gfnVar2);
            }
            gfnVar = (gfn) this.f.get(account);
        }
        return gfnVar;
    }

    public final void e(Integer num, Integer num2) {
        f(num, num2, null, null);
    }

    public final void f(Integer num, Integer num2, Integer num3, Integer num4) {
        int i;
        int i2;
        int i3;
        ewi ewiVar = (ewi) ((myu) this.c).c();
        if (num != null) {
            i = num.intValue();
        } else {
            i = ewiVar.a;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = ewiVar.b;
        }
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = ewiVar.c;
        }
        if (num4 != null) {
            num4.intValue();
        } else {
            int i4 = ewiVar.d;
        }
        ((myu) this.c).e(new ewi(i, i2, i3));
    }

    public final void g(CameraPosition cameraPosition) {
        cameraPosition.getClass();
        ((myu) this.i).e(cameraPosition);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:            if (((defpackage.cby) r4).a(r0) != r1) goto L65;     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.mmx r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbd
            if (r0 == 0) goto L13
            r0 = r6
            cbd r0 = (defpackage.cbd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbd r0 = new cbd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.a
            hpd r0 = r0.e
            defpackage.mjo.o(r6)     // Catch: java.lang.Throwable -> L2e
            goto L67
        L2e:
            r6 = move-exception
            goto L6e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            hpd r2 = r0.e
            defpackage.mjo.o(r6)
            goto L50
        L3e:
            defpackage.mjo.o(r6)
            apc r6 = r5.n()
            r0.e = r5
            r0.c = r4
            java.lang.Object r6 = r6.h()
            if (r6 == r1) goto L7b
            r2 = r5
        L50:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r2.g     // Catch: java.lang.Throwable -> L6a
            r0.e = r2     // Catch: java.lang.Throwable -> L6a
            r0.a = r6     // Catch: java.lang.Throwable -> L6a
            r0.c = r3     // Catch: java.lang.Throwable -> L6a
            cby r4 = (defpackage.cby) r4     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r6 = r4.a(r0)     // Catch: java.lang.Throwable -> L6a
            if (r6 != r1) goto L67
            goto L7b
        L67:
            mlh r6 = defpackage.mlh.a
            return r6
        L6a:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6e:
            java.lang.Object r0 = r0.j
            cbw r2 = new cbw
            r2.<init>(r6, r1)
            ddh r0 = (defpackage.ddh) r0
            r0.s(r2)
            throw r6
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpd.h(mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(boolean r14, defpackage.mmx r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpd.i(boolean, mmx):java.lang.Object");
    }

    public final Object j(mmx mmxVar) {
        return m().b(new ccf(null), mmxVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|87|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x009a, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x009b, code lost:            r11 = r8;        r4 = r4;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0025. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x009b: MOVE (r11 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:156), block:B:86:0x009b */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0164 A[Catch: all -> 0x018a, TryCatch #5 {all -> 0x018a, blocks: (B:27:0x014a, B:29:0x0164, B:33:0x0169), top: B:26:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169 A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #5 {all -> 0x018a, blocks: (B:27:0x014a, B:29:0x0164, B:33:0x0169), top: B:26:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r9v2, types: [moh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(boolean r20, defpackage.mmx r21) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpd.k(boolean, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.Object r12, boolean r13, defpackage.mmx r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.cbl
            if (r0 == 0) goto L13
            r0 = r14
            cbl r0 = (defpackage.cbl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cbl r0 = new cbl
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mpl r12 = r0.c
            defpackage.mjo.o(r14)
            goto L53
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            defpackage.mjo.o(r14)
            mpl r14 = new mpl
            r14.<init>()
            cbs r2 = r11.m()
            cbm r10 = new cbm
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r14
            r0.b = r3
            java.lang.Object r12 = r2.c(r10, r0)
            if (r12 == r1) goto L5b
            r12 = r14
        L53:
            int r12 = r12.a
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpd.l(java.lang.Object, boolean, mmx):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mkt, java.lang.Object] */
    public final cbs m() {
        return (cbs) this.d.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mkt, java.lang.Object] */
    public final apc n() {
        return (apc) this.h.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:            if (r9 == r1) goto L114;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r9v11, types: [mnb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v25, types: [mnb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.eld r9, defpackage.mmx r10) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpd.o(eld, mmx):java.lang.Object");
    }

    public hpd() {
        myu a = myv.a(new ewi(null));
        this.c = a;
        mya myaVar = new mya(a);
        this.d = myaVar;
        this.k = bsn.i(myaVar);
        myu a2 = myv.a(true);
        this.f = a2;
        mya myaVar2 = new mya(a2);
        this.h = myaVar2;
        this.g = bsn.i(myaVar2);
        myu a3 = myv.a(false);
        this.a = a3;
        this.b = new mya(a3);
        myu a4 = myv.a(null);
        this.i = a4;
        mya myaVar3 = new mya(a4);
        this.e = myaVar3;
        this.j = bsn.i(myaVar3);
    }

    public hpd(Context context, Executor executor, kpb kpbVar, ilv ilvVar, ddg ddgVar, fma fmaVar, ilk ilkVar, fhq fhqVar) {
        this.d = new Object();
        this.f = new HashMap();
        this.b = context;
        this.c = executor;
        this.j = kpbVar;
        this.g = ilvVar;
        this.e = ddgVar;
        this.a = fmaVar;
        this.i = "OneGoogle";
        this.h = ilkVar;
        this.k = fhqVar;
    }

    public hpd(ScheduledExecutorService scheduledExecutorService, kpb kpbVar, Application application) {
        this.e = hwx.H(new gvf(this, 5));
        this.c = hwx.H(new gvf(this, 16));
        this.g = hwx.H(new gvf(this, 17));
        hwx.H(new gvf(this, 18));
        hwx.H(new gvf(this, 19));
        this.j = hwx.H(new gvf(this, 6));
        this.d = hwx.H(new gvf(this, 7));
        this.h = hwx.H(new gvf(this, 8));
        this.a = hwx.H(new gvf(this, 9));
        hwx.H(new gvf(this, 10));
        hwx.H(new gvf(this, 11));
        this.i = hwx.H(new gvf(this, 12));
        hwx.H(new gvf(this, 13));
        this.f = hwx.H(new gvf(this, 14));
        hwx.H(new gvf(this, 15));
        imu d = imu.d("STREAMZ_ONEGOOGLE_ANDROID");
        this.k = d;
        imt imtVar = d.c;
        if (imtVar == null) {
            this.b = imw.c(kpbVar, scheduledExecutorService, d, application);
        } else {
            this.b = imtVar;
            ((imw) imtVar).f = kpbVar;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [mko, java.lang.Object] */
    public hpd(hpa hpaVar, mko mkoVar, hnb hnbVar, nca ncaVar, mko mkoVar2, jer jerVar, jer jerVar2, mko mkoVar3, jer jerVar3, mko mkoVar4, Executor executor, lqz lqzVar, mko mkoVar5) {
        this.b = hpaVar;
        this.a = hnbVar;
        this.c = mkoVar;
        this.d = executor;
        this.f = new hsp(mkoVar2, 1);
        Context b = ((lry) ncaVar.e).b();
        Executor executor2 = (Executor) ncaVar.b.a();
        executor2.getClass();
        Object a = ncaVar.c.a();
        ((Boolean) ncaVar.d.a()).booleanValue();
        jer jerVar4 = (jer) ((lsi) ncaVar.a).b;
        jerVar4.getClass();
        this.e = new htu(b, executor2, (hty) a, lqzVar, true, jerVar4, mkoVar5);
        this.g = jerVar;
        this.h = jerVar2;
        this.i = mkoVar3;
        this.j = jerVar3;
        this.k = mkoVar4;
    }
}
