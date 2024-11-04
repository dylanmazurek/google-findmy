package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Process;
import android.os.StrictMode;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class koq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ koq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] m;
        int i;
        switch (this.c) {
            case 0:
                kor korVar = (kor) this.a;
                Process.setThreadPriority(korVar.a);
                StrictMode.ThreadPolicy threadPolicy = korVar.b;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                this.b.run();
                return;
            case 1:
                ((koi) this.a).c(this.b);
                return;
            case 2:
                int i2 = kou.c;
                try {
                    this.b.run();
                    return;
                } catch (Exception e) {
                    ((njz) this.a).e(e);
                    return;
                }
            case 3:
                int i3 = kou.c;
                Object obj = this.a;
                try {
                    this.b.run();
                    ((njz) obj).d(null);
                    return;
                } catch (Exception e2) {
                    ((njz) obj).e(e2);
                    return;
                }
            case 4:
                int i4 = kou.c;
                Object obj2 = this.a;
                try {
                    ((njz) obj2).d(this.b.call());
                    return;
                } catch (Exception e3) {
                    ((njz) obj2).e(e3);
                    return;
                }
            case 5:
                int i5 = kou.c;
                try {
                    this.b.run();
                    return;
                } catch (Exception e4) {
                    ((njz) this.a).e(e4);
                    throw e4;
                }
            case 6:
                Object obj3 = this.a;
                try {
                    ((bym) obj3).s(((FirebaseMessaging) this.b).c());
                    return;
                } catch (Exception e5) {
                    ((bym) obj3).r(e5);
                    return;
                }
            case 7:
                Object obj4 = this.a;
                Object obj5 = this.b;
                try {
                    URLConnection openConnection = ((ksi) obj5).a.openConnection();
                    if (openConnection.getContentLength() <= 1048576) {
                        InputStream inputStream = openConnection.getInputStream();
                        try {
                            krv krvVar = new krv(inputStream);
                            ArrayDeque arrayDeque = new ArrayDeque(20);
                            int highestOneBit = Integer.highestOneBit(0);
                            int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
                            int i6 = 0;
                            while (true) {
                                if (i6 < 2147483639) {
                                    int min2 = Math.min(min, 2147483639 - i6);
                                    byte[] bArr = new byte[min2];
                                    arrayDeque.add(bArr);
                                    int i7 = 0;
                                    while (i7 < min2) {
                                        int read = krvVar.read(bArr, i7, min2 - i7);
                                        if (read == -1) {
                                            m = amr.m(arrayDeque, i6);
                                        } else {
                                            i7 += read;
                                            i6 += read;
                                        }
                                    }
                                    long j = min;
                                    if (min < 4096) {
                                        i = 4;
                                    } else {
                                        i = 2;
                                    }
                                    long j2 = j * i;
                                    if (j2 > 2147483647L) {
                                        min = Integer.MAX_VALUE;
                                    } else if (j2 < -2147483648L) {
                                        min = Integer.MIN_VALUE;
                                    } else {
                                        min = (int) j2;
                                    }
                                } else if (krvVar.read() == -1) {
                                    m = amr.m(arrayDeque, 2147483639);
                                } else {
                                    throw new OutOfMemoryError("input is too large to fit in a byte array");
                                }
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            int length = m.length;
                            if (length <= 1048576) {
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m, 0, length);
                                if (decodeByteArray != null) {
                                    ((bym) obj4).s(decodeByteArray);
                                    return;
                                }
                                throw new IOException("Failed to decode image: ".concat(((ksi) obj5).a.toString()));
                            }
                            throw new IOException("Image exceeds max size of 1048576");
                        } finally {
                        }
                    }
                    throw new IOException("Content-Length exceeds max size of 1048576");
                } catch (Exception e6) {
                    ((bym) obj4).r(e6);
                    return;
                }
            case 8:
                Object obj6 = this.b;
                kuk kukVar = (kuk) this.a;
                kukVar.b.c((kus) obj6);
                kukVar.d();
                return;
            case 9:
                Iterator it = this.b.iterator();
                while (true) {
                    Object obj7 = this.a;
                    if (it.hasNext()) {
                        ((kuk) obj7).b.c((kus) it.next());
                    } else {
                        ((kuk) obj7).d();
                        return;
                    }
                }
            case 10:
                ((kvd) this.a).b().f(this.b);
                return;
            case 11:
                kvi kviVar = (kvi) this.a;
                if (!kviVar.c) {
                    ?? r1 = this.b;
                    if (kviVar.b != null) {
                        try {
                            r1.run();
                            return;
                        } catch (Throwable th) {
                            kviVar.d.a(mca.b(th), new mbc());
                            return;
                        }
                    }
                    kviVar.a.add(r1);
                    return;
                }
                return;
            case 12:
                ((kvi) this.a).b.f(this.b);
                return;
            case 13:
                ((kvt) this.b).b.remove(this.a);
                return;
            case 14:
                ((kvt) this.a).h((mbc) this.b);
                return;
            case 15:
                Object obj8 = this.b;
                kvt kvtVar = (kvt) this.a;
                kvtVar.c.add(new kvq(kvtVar, obj8));
                kvtVar.g();
                return;
            case 16:
                try {
                    this.b.run();
                    return;
                } catch (Throwable th2) {
                    kvt kvtVar2 = (kvt) this.a;
                    kvtVar2.h = true;
                    mjo mjoVar = kvtVar2.j;
                    if (mjoVar != null) {
                        mjoVar.a(mca.b(th2), new mbc());
                        lyv lyvVar = kvtVar2.i;
                        if (lyvVar != null && kvtVar2.e.e == 4) {
                            lyvVar.c(null, th2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 17:
                ((kvt) this.b).i((nqe) this.a);
                return;
            case 18:
                ((kvt) this.b).i((nqe) this.a);
                return;
            case 19:
                kvp kvpVar = (kvp) this.a;
                if (!kvpVar.a) {
                    kvpVar.c.S((mbc) this.b);
                    return;
                }
                return;
            default:
                kvp kvpVar2 = (kvp) this.a;
                if (!kvpVar2.a) {
                    kvpVar2.c.f(this.b);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ koq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
