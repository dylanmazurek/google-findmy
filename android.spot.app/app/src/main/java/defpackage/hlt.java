package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.Dialog;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.adm.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.ar.core.ArCoreApk;
import j$.util.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hlt implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hlt(hmh hmhVar, View view, Bundle bundle, int i) {
        this.d = i;
        this.a = hmhVar;
        this.b = view;
        this.c = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ar.core.ArCoreApk$ICheckAvailabilityCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [idd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        fxs h;
        int i = 0;
        switch (this.d) {
            case 0:
                View view = (View) this.b;
                View findViewById = view.findViewById(R.id.og_header_close_button);
                Object obj = this.a;
                findViewById.setOnClickListener(new ewu(obj, 9));
                hmh hmhVar = (hmh) obj;
                hmhVar.ah = new hls(hmhVar.al, hls.a, view.findViewById(R.id.og_container_scroll_view));
                hmhVar.ah.b();
                if (this.c == null) {
                    ExpandableDialogView expandableDialogView = hmhVar.al;
                    expandableDialogView.getClass();
                    expandableDialogView.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(expandableDialogView, (Property<ExpandableDialogView, Float>) hmh.af, 0.0f, 1.0f);
                    ofFloat.setDuration(83L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(expandableDialogView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.8f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.8f, 1.0f));
                    ofPropertyValuesHolder.setDuration(200L);
                    ofPropertyValuesHolder.setInterpolator(new cee());
                    expandableDialogView.getViewTreeObserver().addOnPreDrawListener(new bot(expandableDialogView, 2));
                    v vVar = (v) obj;
                    Dialog dialog = vVar.d;
                    if (dialog != null && dialog.getWindow() != null) {
                        int c = bqx.c(((ag) obj).y(), R.color.google_scrim);
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(vVar.d.getWindow().getDecorView(), (Property<View, V>) hmh.ag, new ind(), Integer.valueOf(bro.c(c, 0)), Integer.valueOf(c));
                        ofObject.setInterpolator(new LinearInterpolator());
                        ofObject.setDuration(200L);
                        ofObject.start();
                    }
                    ofFloat.start();
                    ofPropertyValuesHolder.start();
                    return;
                }
                return;
            case 1:
                ((imq) ((hpd) ((hri) this.c).a.a()).a.a()).b(this.b, this.a);
                return;
            case 2:
                htu.b(new hka(this.c, this.b, 6), this.a);
                return;
            case 3:
                Object obj2 = this.c;
                Object obj3 = this.a;
                try {
                    try {
                        ivc.M(this.b);
                    } finally {
                        ((BroadcastReceiver.PendingResult) obj2).finish();
                    }
                } catch (ExecutionException e) {
                    Log.w("PhenotypeBackgroundRecv", a.ao((String) obj3, "Failed to update local snapshot for "), e);
                }
                return;
            case 4:
                Object obj4 = this.c;
                hzb hzbVar = (hzb) ((hyy) this.a).f.get(obj4);
                Object obj5 = this.b;
                if (hzbVar == null) {
                    ((jni) ((jni) hyy.a.f()).j("com/google/android/libraries/precisionfinding/ranging/PrecisionRangingImpl", "lambda$start$0", 249, "PrecisionRangingImpl.java")).u("No ranging adapter found when trying to start for %s", obj4);
                    return;
                }
                synchronized (hzbVar.f) {
                    ((jni) ((jni) hzb.a.e()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter", "start", 100, "UwbAdapter.java")).r("Start UwbAdapter called.");
                    if (hzbVar.b.isEmpty()) {
                        ((izl) obj5).b();
                        return;
                    }
                    if (hzbVar.h != 1) {
                        ((jni) ((jni) hzb.a.g()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter", "start", 106, "UwbAdapter.java")).r("Tried to start UWB while it is not in stopped state");
                        return;
                    }
                    hzbVar.h = 2;
                    hzbVar.e = Optional.of(obj5);
                    hza hzaVar = new hza(hzbVar);
                    synchronized (hzbVar.f) {
                        if (hzbVar.h == 1) {
                            return;
                        }
                        if (hzbVar.d.isEmpty()) {
                            ((izl) hzbVar.e.get()).b();
                            return;
                        }
                        hzbVar.c = Optional.of(hzaVar);
                        Object obj6 = hzbVar.b.get();
                        Object obj7 = hzbVar.d.get();
                        fuu fuuVar = (fuu) obj6;
                        ftq ftqVar = fuuVar.a;
                        if (ftqVar == null) {
                            h = fma.n(new fhn(new Status(42002)));
                        } else {
                            fud fudVar = new fud(fuuVar, hzaVar);
                            fjy fjyVar = new fjy();
                            fjyVar.a = new fuo(ftqVar, (ftn) obj7, fudVar, i);
                            fjyVar.c = 1304;
                            fjyVar.b = new Feature[]{ftb.i};
                            h = ((fhq) obj6).h(fjyVar.a());
                        }
                        iuu.q(fzo.b(h), new dup(hzbVar, 14), hzbVar.g);
                        return;
                    }
                }
            case 5:
                Object obj8 = this.b;
                Object obj9 = this.a;
                Object obj10 = this.c;
                synchronized (((idt) obj10).h) {
                    if (obj9 == ((idt) obj10).h.get(((jer) obj8).c())) {
                        ((idt) obj10).h.remove(((jer) obj8).c());
                    }
                }
                return;
            case 6:
                this.b.a((BluetoothGattCharacteristic) this.c, (lim) this.a);
                return;
            case 7:
                try {
                    iyr iyrVar = ((jcs) this.a).e;
                    String str = ((Context) this.c).getApplicationInfo().packageName;
                    Bundle h2 = jcs.h();
                    jcu jcuVar = new jcu(this);
                    Parcel a = iyrVar.a();
                    a.writeString(str);
                    duh.c(a, h2);
                    duh.d(a, jcuVar);
                    iyrVar.d(2, a);
                    return;
                } catch (RemoteException e2) {
                    Log.e("ARCore-InstallService", "requestInfo threw", e2);
                    this.b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
                    return;
                }
            case 8:
                try {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    iyr iyrVar2 = ((jcs) this.a).e;
                    String str2 = ((Activity) this.c).getApplicationInfo().packageName;
                    List singletonList = Collections.singletonList(jcs.h());
                    Bundle bundle = new Bundle();
                    jcx jcxVar = new jcx(this, atomicBoolean);
                    Parcel a2 = iyrVar2.a();
                    a2.writeString(str2);
                    a2.writeTypedList(singletonList);
                    duh.c(a2, bundle);
                    duh.d(a2, jcxVar);
                    iyrVar2.d(1, a2);
                    new Handler().postDelayed(new hka(this, atomicBoolean, 17), 3000L);
                    return;
                } catch (RemoteException e3) {
                    Log.w("ARCore-InstallService", "requestInstall threw, launching fullscreen.", e3);
                    jcs.g((Activity) this.c, (jcq) this.b);
                    return;
                }
            case 9:
                ((kou) this.c).a.execute(new koq(this.a, this.b, 2, null));
                return;
            case 10:
                ((kou) this.c).a.execute(new koq(this.a, this.b, 5, null));
                return;
            case 11:
                ((kou) this.c).a.execute(new koq(this.a, this.b, 3, null));
                return;
            case 12:
                Object obj11 = this.b;
                try {
                    ((krz) this.a).e((Intent) this.c);
                    return;
                } finally {
                    ((bym) obj11).s(null);
                }
            case 13:
                Iterator it = this.a.iterator();
                while (true) {
                    Object obj12 = this.c;
                    if (it.hasNext()) {
                        ((kuk) obj12).b.d((kus) it.next(), (String) this.b);
                    } else {
                        ((kuk) obj12).d();
                        return;
                    }
                }
            case 14:
                Object obj13 = this.a;
                Object obj14 = this.b;
                kuk kukVar = (kuk) this.c;
                kukVar.b.d((kus) obj14, (String) obj13);
                kukVar.d();
                return;
            case 15:
                ((kvd) this.c).b().c((String) this.b, (Throwable) this.a);
                return;
            case 16:
                ((kvd) this.c).b().a((mjo) this.b, (mbc) this.a);
                return;
            case 17:
                ((kvi) this.c).b.c((String) this.b, (Throwable) this.a);
                return;
            case 18:
                ((kvi) this.c).b.a((mjo) this.b, (mbc) this.a);
                return;
            case 19:
                ((kvt) this.a).j((hwx) this.c, (kvq) this.b);
                return;
            default:
                kvt kvtVar = (kvt) this.c;
                Iterator it2 = kvtVar.b.iterator();
                while (it2.hasNext()) {
                    ((jyz) it2.next()).cancel(true);
                }
                lyv lyvVar = kvtVar.i;
                if (lyvVar != null) {
                    lyvVar.c((String) this.b, (Throwable) this.a);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ hlt(idd iddVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, lim limVar, int i) {
        this.d = i;
        this.b = iddVar;
        this.c = bluetoothGattCharacteristic;
        this.a = limVar;
    }

    public /* synthetic */ hlt(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ hlt(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hlt(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public hlt(jcs jcsVar, Context context, Object obj, int i) {
        this.d = i;
        this.c = context;
        this.b = obj;
        this.a = jcsVar;
    }

    public /* synthetic */ hlt(jys jysVar, String str, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.d = i;
        this.b = jysVar;
        this.a = str;
        this.c = pendingResult;
    }
}
