package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.RenameRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cye implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cye(fsr fsrVar, Uri uri, Uri uri2, int i) {
        this.d = i;
        this.c = fsrVar;
        this.a = uri;
        this.b = uri2;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, jyz] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        int i = this.d;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            boolean booleanValue = ((Boolean) ((lys) ((nqe) this.b).d).e(ktu.a)).booleanValue();
                            ?? r2 = this.c;
                            Object obj = this.a;
                            if (booleanValue) {
                                eme emeVar = (eme) obj;
                                return emeVar.b(emeVar.a(jjr.m(r2)), true);
                            }
                            eme emeVar2 = (eme) obj;
                            return emeVar2.b(emeVar2.a(jjr.m(r2)), false);
                        }
                        return ((kou) this.a).a.submit(new koq(this.c, this.b, 4, null));
                    }
                    ?? r0 = this.a;
                    ?? r22 = this.b;
                    ?? r4 = this.c;
                    List list = (List) hkx.g(r0, "device accounts");
                    List<Account> list2 = (List) hkx.g(r22, "g1 accounts");
                    jis jisVar = (jis) hkx.g(r4, "owners");
                    if (list == null && list2 == null && jisVar == null) {
                        throw new hjx();
                    }
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            hog.B(((Account) it.next()).name, arrayList, hashMap);
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (list2 != null) {
                        for (Account account : list2) {
                            if (!z) {
                                hog.B(account.name, arrayList, hashMap);
                            }
                            hjv hjvVar = (hjv) hashMap.get(account.name);
                            if (hjvVar != null) {
                                hjvVar.c(true);
                            }
                        }
                    }
                    if (jisVar != null) {
                        int size = jisVar.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            hjw hjwVar = (hjw) jisVar.get(i3);
                            String str = hjwVar.a;
                            if (!z) {
                                hog.B(str, arrayList, hashMap);
                            }
                            hjv hjvVar2 = (hjv) hashMap.get(str);
                            if (hjvVar2 != null) {
                                hjvVar2.a = hjwVar.c;
                                hjvVar2.b = hjwVar.d;
                                hjvVar2.c = hjwVar.e;
                                hjvVar2.d = hjwVar.f;
                                hjvVar2.e = hjwVar.h;
                                hjvVar2.e(hjwVar.i);
                            }
                        }
                    }
                    jin jinVar = new jin();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        jinVar.h(((hjv) hashMap.get((String) it2.next())).a());
                    }
                    return jinVar.g();
                }
                Object obj2 = this.a;
                Object obj3 = this.b;
                fhq fhqVar = (fhq) ((jfh) ((fsr) this.c).a).a;
                RenameRequest renameRequest = new RenameRequest((Uri) obj2, (Uri) obj3);
                fjy fjyVar = new fjy();
                fjyVar.a = new fsw(renameRequest, i2);
                fjyVar.b = new Feature[]{fpj.g};
                fjyVar.b();
                fjyVar.c = 7803;
                return (Void) fma.p(fhqVar.f(fjyVar.a()));
            }
            crd crdVar = (crd) this.a;
            WorkDatabase workDatabase = crdVar.c;
            String str2 = (String) this.b;
            ((ArrayList) this.c).addAll(workDatabase.C().a(str2));
            return crdVar.c.B().a(str2);
        }
        return cyg.a((Context) this.a, (String) this.b, (String) this.c);
    }

    public /* synthetic */ cye(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ cye(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ cye(nqe nqeVar, ktv ktvVar, Set set, int i) {
        this.d = i;
        this.b = nqeVar;
        this.a = ktvVar;
        this.c = set;
    }
}
