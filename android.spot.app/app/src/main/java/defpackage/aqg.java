package defpackage;

import android.accounts.Account;
import android.net.ConnectivityManager;
import android.view.KeyEvent;
import androidx.work.impl.WorkDatabase;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqg extends mpe implements mnw {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [bah] */
    /* JADX WARN: Type inference failed for: r0v35, types: [cex] */
    /* JADX WARN: Type inference failed for: r0v4, types: [mvy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [dhd] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, cfb] */
    /* JADX WARN: Type inference failed for: r1v22, types: [dsw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [aow] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [aow] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [aiu] */
    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                ((mpn) this.a).a = ((aqh) this.b).a();
                return mlh.a;
            case 1:
                this.a.j(this.b);
                return mlh.a;
            case 2:
                azh azhVar = ((ayr) this.b).n;
                if ((azhVar.a() & 8) != 0) {
                    for (aow aowVar = azhVar.d; aowVar != null; aowVar = aowVar.n) {
                        if ((aowVar.l & 8) != 0) {
                            axx axxVar = aowVar;
                            ?? r3 = 0;
                            while (axxVar != 0) {
                                if (axxVar instanceof baa) {
                                    Object obj = this.a;
                                    baa baaVar = (baa) axxVar;
                                    if (baaVar.h()) {
                                        mpn mpnVar = (mpn) obj;
                                        mpnVar.a = new bfe();
                                        ((bfe) mpnVar.a).c = true;
                                    }
                                    baaVar.i((bfe) ((mpn) obj).a);
                                } else if ((axxVar.l & 8) != 0 && (axxVar instanceof axx)) {
                                    aow aowVar2 = axxVar.d;
                                    int i = 0;
                                    axxVar = axxVar;
                                    r3 = r3;
                                    while (aowVar2 != null) {
                                        if ((aowVar2.l & 8) != 0) {
                                            i++;
                                            r3 = r3;
                                            if (i == 1) {
                                                axxVar = aowVar2;
                                            } else {
                                                if (r3 == 0) {
                                                    r3 = new aiu(new aow[16]);
                                                }
                                                if (axxVar != 0) {
                                                    r3.o(axxVar);
                                                }
                                                r3.o(aowVar2);
                                                axxVar = 0;
                                            }
                                        }
                                        aowVar2 = aowVar2.o;
                                        axxVar = axxVar;
                                        r3 = r3;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                axxVar = qg.d(r3);
                            }
                        }
                    }
                }
                return mlh.a;
            case 3:
                azq azqVar = ((ayz) this.a).a().u;
                if (azqVar == null || azqVar.k == null) {
                    ayu.a(((ayz) this.a).a);
                    moh mohVar = aws.a;
                }
                Object obj2 = this.b;
                Object obj3 = this.a;
                ayx ayxVar = (ayx) obj2;
                moh mohVar2 = ayxVar.w;
                if (mohVar2 == null) {
                    awq.g(((ayz) obj3).a(), ayxVar.x, ayxVar.y);
                } else {
                    azq a = ((ayz) obj3).a();
                    long j = ayxVar.x;
                    float f = ayxVar.y;
                    awq.c(a);
                    a.r(blk.d(j, a.e), f, mohVar2);
                }
                return mlh.a;
            case 4:
                return Boolean.valueOf(baw.C((baw) this.a, (KeyEvent) this.b));
            case 5:
                ((bah) this.b).removeOnAttachStateChangeListener(this.a);
                return mlh.a;
            case 6:
                ((cex) this.b).c(this.a);
                return mlh.a;
            case 7:
                cqc.b();
                long j2 = ctr.a;
                ((ctj) this.a).a.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.b);
                return mlh.a;
            case 8:
                Object obj4 = this.b;
                cuj cujVar = ((cts) this.a).a;
                synchronized (cujVar.b) {
                    if (cujVar.c.remove(obj4) && cujVar.c.isEmpty()) {
                        cujVar.e();
                    }
                }
                return mlh.a;
            case 9:
                Object obj5 = this.b;
                WorkDatabase workDatabase = ((csb) obj5).c;
                workDatabase.getClass();
                workDatabase.o(new cui(obj5, this.a, 3, (byte[]) null));
                bpn.m((csb) this.b);
                return mlh.a;
            case 10:
                bpn.l((String) this.a, (csb) this.b);
                bpn.m((csb) this.b);
                return mlh.a;
            case 11:
                ((dhd) this.b).g(this.a);
                return mlh.a;
            default:
                Account account = (Account) this.b;
                return new File(((evw) this.a).b.getApplicationContext().getFilesDir(), "datastore/".concat(account.type + ":" + account.name + "_" + ((evw) this.a).c + ".pb"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
