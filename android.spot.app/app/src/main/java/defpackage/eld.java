package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.BidiFormatter;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eld {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public eld(Context context, Account account, String str, Executor executor) {
        this.d = context;
        this.a = account;
        this.b = str;
        this.c = executor;
    }

    public static /* synthetic */ void k(eld eldVar, bio bioVar, Object obj) {
        bil bilVar = new bil(bioVar);
        synchronized (eldVar.c) {
            if (obj == null) {
                Object obj2 = eldVar.a;
                Object obj3 = eldVar.d;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [mko, java.lang.Object] */
    public final /* synthetic */ elc a(lqd lqdVar, ekz ekzVar, ebf ebfVar) {
        ?? r0 = this.a;
        BidiFormatter b = dwb.b();
        ejo ejoVar = (ejo) r0.a();
        ejoVar.getClass();
        ewf ewfVar = (ewf) this.b.a();
        ewfVar.getClass();
        ele eleVar = (ele) this.c.a();
        eleVar.getClass();
        ilv ilvVar = (ilv) this.d.a();
        ilvVar.getClass();
        return new elc(lqdVar, ekzVar, ebfVar, b, ejoVar, ewfVar, eleVar, ilvVar);
    }

    public final String b() {
        Intent intent;
        try {
            return fej.d((Context) this.d, (Account) this.a, (String) this.b, new Bundle());
        } catch (UserRecoverableAuthException e) {
            Intent intent2 = e.a;
            if (intent2 == null) {
                int ordinal = e.b.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
                        }
                    } else {
                        Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                    }
                } else {
                    Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                }
                intent = null;
            } else {
                intent = new Intent(intent2);
            }
            if (intent == null) {
                throw new dfg((byte[]) null);
            }
            throw new dfg(intent);
        } catch (fed e2) {
            e = e2;
            throw new dfg(e);
        } catch (IOException e3) {
            e = e3;
            throw new dfg(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    public final synchronized void c(dfq dfqVar) {
        ?? r0 = this.b;
        String c = dfqVar.c();
        List list = (List) r0.remove(c);
        if (list != null && !list.isEmpty()) {
            String str = dga.a;
            dfq dfqVar2 = (dfq) list.remove(0);
            this.b.put(c, list);
            dfqVar2.n(this);
            try {
                this.c.put(dfqVar2);
            } catch (InterruptedException e) {
                dga.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                ((dfi) this.a).a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map, java.lang.Object] */
    public final synchronized boolean d(dfq dfqVar) {
        ?? r0 = this.b;
        String c = dfqVar.c();
        if (r0.containsKey(c)) {
            List list = (List) this.b.get(c);
            if (list == null) {
                list = new ArrayList();
            }
            int i = dfz.a;
            list.add(dfqVar);
            this.b.put(c, list);
            String str = dga.a;
            return true;
        }
        this.b.put(c, null);
        dfqVar.n(this);
        String str2 = dga.a;
        return false;
    }

    public final /* synthetic */ void e(Runnable runnable) {
        ((cxd) this.a).execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, cgn] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map, java.lang.Object] */
    public final cgk f(mql mqlVar, String str) {
        cgk n;
        boolean isInstance;
        synchronized (this.a) {
            n = ((ddh) this.c).n(str);
            Class cls = ((mox) mqlVar).d;
            Map map = mox.a;
            map.getClass();
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                isInstance = mpp.d(n, num.intValue());
            } else {
                if (cls.isPrimitive()) {
                    cls = moz.b(moz.c(cls));
                }
                isInstance = cls.isInstance(n);
            }
            if (isInstance) {
                Object obj = this.b;
                if (obj instanceof cgp) {
                    n.getClass();
                    ((cgp) obj).e(n);
                }
                n.getClass();
            } else {
                cgv cgvVar = new cgv((cgu) this.d);
                cgvVar.b(cgc.a, str);
                n = bvc.n(this.b, mqlVar, cgvVar);
                Object obj2 = this.c;
                n.getClass();
                cgk cgkVar = (cgk) ((ddh) obj2).a.put(str, n);
                if (cgkVar != null) {
                    cgkVar.s();
                }
            }
        }
        return n;
    }

    public final ArrayList g(Object obj) {
        return (ArrayList) ((ta) this.b).get(obj);
    }

    public final void h(Object obj) {
        if (!((ta) this.b).containsKey(obj)) {
            ((ta) this.b).put(obj, null);
        }
    }

    public final void i(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((ta) this.b).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    i(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.bio r6, defpackage.moh r7, defpackage.mmx r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.bim
            if (r0 == 0) goto L13
            r0 = r8
            bim r0 = (defpackage.bim) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bim r0 = new bim
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            bil r6 = r0.c
            eld r7 = r0.e
            defpackage.mjo.o(r8)
            goto L6b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.mjo.o(r8)
            bil r8 = new bil
            r8.<init>(r6)
            java.lang.Object r6 = r5.c
            monitor-enter(r6)
            java.lang.Object r2 = r5.b     // Catch: java.lang.Throwable -> L92
            bib r2 = (defpackage.bib) r2     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r2.b(r8)     // Catch: java.lang.Throwable -> L92
            bik r2 = (defpackage.bik) r2     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L54
            java.lang.Object r2 = r5.a     // Catch: java.lang.Throwable -> L92
            bic r2 = (defpackage.bic) r2     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r2.d(r8)     // Catch: java.lang.Throwable -> L92
            bik r2 = (defpackage.bik) r2     // Catch: java.lang.Throwable -> L92
        L54:
            if (r2 == 0) goto L5a
            java.lang.Object r7 = r2.a     // Catch: java.lang.Throwable -> L92
            monitor-exit(r6)
            return r7
        L5a:
            monitor-exit(r6)
            r0.e = r5
            r0.c = r8
            r0.b = r3
            java.lang.Object r6 = r7.a(r0)
            if (r6 == r1) goto L91
            r7 = r5
            r4 = r8
            r8 = r6
            r6 = r4
        L6b:
            java.lang.Object r0 = r7.c
            monitor-enter(r0)
            if (r8 != 0) goto L80
            java.lang.Object r1 = r7.a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = r7.d     // Catch: java.lang.Throwable -> L8e
            bik r7 = new bik     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            bic r1 = (defpackage.bic) r1     // Catch: java.lang.Throwable -> L8e
            r1.f(r6, r7)     // Catch: java.lang.Throwable -> L8e
            goto L8c
        L80:
            java.lang.Object r7 = r7.b     // Catch: java.lang.Throwable -> L8e
            bik r1 = new bik     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            bib r7 = (defpackage.bib) r7     // Catch: java.lang.Throwable -> L8e
            r7.c(r6, r1)     // Catch: java.lang.Throwable -> L8e
        L8c:
            monitor-exit(r0)
            return r8
        L8e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L91:
            return r1
        L92:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eld.j(bio, moh, mmx):java.lang.Object");
    }

    public eld(dbr dbrVar, dbr dbrVar2, dbs dbsVar, dbs dbsVar2) {
        this.b = dbrVar;
        this.a = dbrVar2;
        this.c = dbsVar;
        this.d = dbsVar2;
    }

    public eld(ddh ddhVar, cgn cgnVar, cgu cguVar) {
        this.c = ddhVar;
        this.b = cgnVar;
        this.d = cguVar;
        this.a = new bvp();
    }

    public eld(ejy ejyVar, String str, Drawable drawable, jer jerVar) {
        this.a = ejyVar;
        this.d = str;
        this.b = drawable;
        this.c = jerVar;
    }

    public eld(List list, djx djxVar, dlu dluVar, ContentResolver contentResolver) {
        this.d = djxVar;
        this.b = dluVar;
        this.a = contentResolver;
        this.c = list;
    }

    public eld(jer jerVar, ele eleVar, eim eimVar, lqz lqzVar) {
        this.b = jerVar;
        this.d = eleVar;
        this.a = eimVar;
        this.c = lqzVar;
    }

    public eld(chs chsVar, int[] iArr, String[] strArr) {
        chsVar.getClass();
        iArr.getClass();
        strArr.getClass();
        this.b = chsVar;
        this.d = iArr;
        this.a = strArr;
        int length = iArr.length;
        String[] strArr2 = strArr;
        int length2 = strArr2.length;
        if (length == length2) {
            this.c = length2 == 0 ? mlz.a : mkm.E(strArr2[0]);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public eld(dfi dfiVar, BlockingQueue blockingQueue, ddh ddhVar) {
        this.b = new HashMap();
        this.d = ddhVar;
        this.a = dfiVar;
        this.c = blockingQueue;
    }

    public eld(ejy ejyVar, String str, Drawable drawable) {
        this(ejyVar, str, drawable, jdl.a);
    }

    public eld(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4) {
        mkoVar.getClass();
        this.a = mkoVar;
        mkoVar2.getClass();
        this.b = mkoVar2;
        mkoVar3.getClass();
        this.c = mkoVar3;
        mkoVar4.getClass();
        this.d = mkoVar4;
    }

    public eld(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = null;
        this.b = new bib();
        this.a = new bic(null);
        this.c = new rm();
    }

    public eld(byte[] bArr, byte[] bArr2) {
        this.a = new bug(10);
        this.b = new ta();
        this.c = new ArrayList();
        this.d = new HashSet();
    }

    public eld() {
        this.d = new rx();
        this.b = new SparseArray();
        this.a = new sl();
        this.c = new rx();
    }

    public eld(mol molVar, msk mskVar, ccd ccdVar, mnb mnbVar) {
        mnbVar.getClass();
        this.d = molVar;
        this.a = mskVar;
        this.c = ccdVar;
        this.b = mnbVar;
    }

    public eld(msw mswVar, moh mohVar, mol molVar, mol molVar2) {
        this.d = mswVar;
        this.b = molVar2;
        this.a = moz.at(Integer.MAX_VALUE, 0, 6);
        this.c = new bym();
        muf mufVar = (muf) ((naj) mswVar).a.get(muf.c);
        if (mufVar != null) {
            mufVar.w(new ud(mohVar, this, molVar, 9, null));
        }
    }

    public eld(Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new cxn(this);
        cxd cxdVar = new cxd(executor, 0);
        this.a = cxdVar;
        this.d = mkm.aH(cxdVar);
    }
}
