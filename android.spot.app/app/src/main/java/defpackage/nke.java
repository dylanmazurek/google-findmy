package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nke {
    public static final byte[] a = {42};
    public static final List b = mkm.N("*");
    public static final nke c = new nke();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CountDownLatch e = new CountDownLatch(1);
    public byte[] f;
    public byte[] g;

    public final List a(String str) {
        List aO;
        int i = 0;
        aO = moz.aO(str, String.valueOf(new char[]{'.'}[0]));
        if (amr.i(mkm.Z(aO), "")) {
            int ac = moz.ac(aO.size() - 1, 0);
            if (ac >= 0) {
                if (ac == 0) {
                    return mlx.a;
                }
                if (ac >= aO.size()) {
                    return mkm.ag(aO);
                }
                if (ac == 1) {
                    return mkm.N(mkm.V(aO));
                }
                ArrayList arrayList = new ArrayList(ac);
                Iterator it = aO.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                    i++;
                    if (i == ac) {
                        break;
                    }
                }
                return mkm.R(arrayList);
            }
            throw new IllegalArgumentException(a.am(ac, "Requested element count ", " is less than zero."));
        }
        return aO;
    }

    public final void b() {
        mpn mpnVar;
        mpn mpnVar2;
        InputStream resourceAsStream;
        CountDownLatch countDownLatch;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        mpnVar = new mpn();
                        mpnVar2 = new mpn();
                        resourceAsStream = nke.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        nju.b.k("Failed to read public suffix list", 5, e);
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                this.e.countDown();
                throw th;
            }
        }
        if (resourceAsStream == null) {
            countDownLatch = this.e;
        } else {
            nlf nlfVar = new nlf(new nkw(nkz.b(resourceAsStream)));
            try {
                mpnVar.a = nlfVar.y(nlfVar.f());
                mpnVar2.a = nlfVar.y(nlfVar.f());
                mjo.r(nlfVar, null);
                synchronized (this) {
                    Object obj = mpnVar.a;
                    obj.getClass();
                    this.f = (byte[]) obj;
                    Object obj2 = mpnVar2.a;
                    obj2.getClass();
                    this.g = (byte[]) obj2;
                }
                countDownLatch = this.e;
            } finally {
            }
        }
        countDownLatch.countDown();
    }
}
