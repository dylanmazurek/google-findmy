package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class csf implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public csf(chi chiVar, int i) {
        this.b = i;
        this.a = chiVar;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [jfe, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        Account[] accountArr;
        int i = 2;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        Object obj = null;
        switch (this.b) {
            case 0:
                cvu cvuVar = ((csl) this.a).a;
                if (cvuVar.w != 1) {
                    String str = csm.a;
                    cqc.b();
                    return true;
                }
                if ((cvuVar.d() || cvuVar.c()) && System.currentTimeMillis() < cvuVar.a()) {
                    cqc.b();
                    String str2 = csm.a;
                    return true;
                }
                return false;
            case 1:
                ((chi) this.a).e.set(true);
                try {
                    Process.setThreadPriority(10);
                    obj = ((chi) this.a).a();
                    Binder.flushPendingCommands();
                    return obj;
                } catch (Throwable th) {
                    try {
                        ((chi) this.a).d.set(true);
                        throw th;
                    } finally {
                        ((chi) this.a).d(obj);
                    }
                }
            case 2:
                csl cslVar = (csl) this.a;
                if (cslVar.e.j(cslVar.c) == 1) {
                    cslVar.e.m(2, cslVar.c);
                    cvv cvvVar = cslVar.e;
                    String str3 = cslVar.c;
                    cwn cwnVar = (cwn) cvvVar;
                    cwnVar.a.l();
                    cks d = cwnVar.f.d();
                    d.g(1, str3);
                    try {
                        ((cwn) cvvVar).a.m();
                        try {
                            d.a();
                            ((cwn) cvvVar).a.p();
                            cwnVar.f.f(d);
                            cslVar.e.i(cslVar.c, -256);
                            z2 = true;
                        } finally {
                            ((cwn) cvvVar).a.n();
                        }
                    } catch (Throwable th2) {
                        cwnVar.f.f(d);
                        throw th2;
                    }
                }
                return Boolean.valueOf(z2);
            case 3:
                return Integer.valueOf(cwv.d((WorkDatabase) ((bet) this.a).a, "next_alarm_manager_id"));
            case 4:
                bet betVar = (bet) this.a;
                int d2 = cwv.d((WorkDatabase) betVar.a, "next_job_scheduler_id");
                if (d2 >= 0) {
                    i2 = d2;
                } else {
                    cwv.e((WorkDatabase) betVar.a, "next_job_scheduler_id", 1);
                }
                return Integer.valueOf(i2);
            case 5:
                return new cyr(this.a);
            case 6:
                Object obj2 = this.a;
                synchronized (((emz) obj2).h) {
                    if (((emz) obj2).g) {
                        ((emz) obj2).a();
                    }
                }
                return null;
            case 7:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    gay gayVar = (gay) ivc.M((jyz) it.next());
                    if (gayVar != null) {
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hwx.V(z, "More than one auth provider provided result.");
                        obj = gayVar;
                    }
                }
                if (obj != null) {
                    return obj;
                }
                throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
            case 8:
                Context context = ((hju) this.a).b;
                fma.aR(context);
                fej.f(context, 11400000);
                String str4 = context.getApplicationInfo().packageName;
                hwa.f(context);
                if (luj.c() && fej.i(context)) {
                    fes fesVar = new fes(context);
                    fma.aS(str4, "Client package name cannot be null!");
                    fjy fjyVar = new fjy();
                    fjyVar.b = new Feature[]{fec.b};
                    fjyVar.a = new fep(str4, i);
                    fjyVar.c = 1514;
                    try {
                        Bundle bundle = (Bundle) fej.b(fesVar.h(fjyVar.a()), "google accounts access request");
                        String string = bundle.getString("Error");
                        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
                        if (feu.SUCCESS.equals(feu.a(string))) {
                            return true;
                        }
                        fej.h(context, "requestGoogleAccountsAccess", string, intent, pendingIntent);
                        throw new fed("Invalid state. Shouldn't happen");
                    } catch (fhn e) {
                        fej.g(e, "google accounts access request");
                    }
                }
                return (Boolean) fej.j(context, fej.c, new feh(str4, context));
            case 9:
                Context context2 = ((hju) this.a).b;
                final String[] strArr = hju.a;
                fma.aR(context2);
                fma.aP("com.google");
                fej.f(context2, 8400000);
                hwa.f(context2);
                if (luj.a.a().b() && fej.i(context2)) {
                    fes fesVar2 = new fes(context2);
                    GetAccountsRequest getAccountsRequest = new GetAccountsRequest("com.google", strArr);
                    fjy fjyVar2 = new fjy();
                    fjyVar2.b = new Feature[]{fec.b};
                    fjyVar2.a = new fep(getAccountsRequest, 3);
                    fjyVar2.c = 1516;
                    try {
                        List list = (List) fej.b(fesVar2.h(fjyVar2.a()), "Accounts retrieval");
                        fej.l(list);
                        accountArr = (Account[]) list.toArray(new Account[0]);
                    } catch (fhn e2) {
                        fej.g(e2, "Accounts retrieval");
                    }
                    return Arrays.asList(accountArr);
                }
                accountArr = (Account[]) fej.j(context2, fej.c, new fei() { // from class: fee
                    public final /* synthetic */ String a = "com.google";

                    @Override // defpackage.fei
                    public final Object a(IBinder iBinder) {
                        ezw ezwVar;
                        Parcelable[] parcelableArray;
                        String[] strArr2 = fej.a;
                        if (iBinder == null) {
                            ezwVar = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            if (queryLocalInterface instanceof ezw) {
                                ezwVar = (ezw) queryLocalInterface;
                            } else {
                                ezwVar = new ezw(iBinder);
                            }
                        }
                        String[] strArr3 = strArr;
                        String str5 = this.a;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("accountType", str5);
                        bundle2.putStringArray("account_features", strArr3);
                        Parcel a = ezwVar.a();
                        duh.c(a, bundle2);
                        Parcel b = ezwVar.b(6, a);
                        Bundle bundle3 = (Bundle) duh.a(b, Bundle.CREATOR);
                        b.recycle();
                        if (bundle3 != null && (parcelableArray = bundle3.getParcelableArray("accounts")) != null) {
                            Account[] accountArr2 = new Account[parcelableArray.length];
                            for (int i3 = 0; i3 < parcelableArray.length; i3++) {
                                accountArr2[i3] = (Account) parcelableArray[i3];
                            }
                            return accountArr2;
                        }
                        throw new IOException("Receive null result from service call.");
                    }
                });
                return Arrays.asList(accountArr);
            case 10:
                return Arrays.asList(fej.m(((hju) this.a).b));
            case 11:
                return (hjy) this.a.a();
            case 12:
                ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterMaxDelay", 114, "DeferrableExecutor.java")).r("DeferrableExecutor unblocked after max task delay");
                ((hmp) this.a).i();
                return null;
            case 13:
                ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 120, "DeferrableExecutor.java")).r("DeferrableExecutor unblocked after onResume");
                ((hmp) this.a).i();
                return null;
            case 14:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            case 15:
                String[] strArr2 = hzs.a;
                return ((Context) this.a).getExternalFilesDirs(null);
            case 16:
                String[] strArr3 = hzs.a;
                return ((Context) this.a).getExternalCacheDirs();
            case 17:
                ((fyz) this.a).b();
                return null;
            case 18:
                Object obj3 = this.a;
                synchronized (((ifo) obj3).h) {
                    if (((ifo) obj3).j == ifj.RINGING) {
                        ((ifo) obj3).o = true;
                        ((ifo) obj3).l = null;
                        ((ifo) obj3).h();
                    }
                }
                return null;
            case 19:
                Object obj4 = this.a;
                synchronized (((ifo) obj4).h) {
                    if (((ifo) obj4).l == null) {
                        z3 = true;
                    }
                    hwx.U(z3);
                    ((ifo) obj4).m = null;
                    ((ifo) obj4).i();
                }
                return null;
            default:
                Object obj5 = this.a;
                synchronized (((ime) obj5).b.d) {
                    ((ime) obj5).a = null;
                }
                return null;
        }
    }

    public /* synthetic */ csf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
