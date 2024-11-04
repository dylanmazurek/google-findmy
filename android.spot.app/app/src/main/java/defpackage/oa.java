package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public oa(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.d = i2;
        this.c = view;
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [pd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.io.Serializable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Object obj = null;
        switch (this.d) {
            case 0:
                int i2 = this.a;
                pk pkVar = (pk) this.c;
                String str = (String) pkVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    bfi bfiVar = (bfi) pkVar.d.get(str);
                    if (bfiVar != null) {
                        obj = bfiVar.b;
                    }
                    Object obj2 = ((bet) this.b).a;
                    if (obj != null) {
                        ?? r1 = bfiVar.b;
                        if (pkVar.c.remove(str)) {
                            r1.a(obj2);
                            return;
                        }
                        return;
                    }
                    pkVar.f.remove(str);
                    pkVar.e.put(str, obj2);
                    return;
                }
                return;
            case 1:
                ((TextView) this.b).setTypeface((Typeface) this.c, this.a);
                return;
            case 2:
                ((pk) this.b).e(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable) this.c));
                return;
            case 3:
                ((qr) this.c).o(this.a, this.b);
                return;
            case 4:
                int length = ((String[]) this.b).length;
                int[] iArr = new int[length];
                Activity activity = (Activity) this.c;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = packageManager.checkPermission(((String[]) this.b)[i3], packageName);
                }
                ((aj) this.c).onRequestPermissionsResult(this.a, (String[]) this.b, iArr);
                return;
            case 5:
                if (((fdu) ((gok) this.b).b).a(this.a)) {
                    ((fck) this.c).y("Local AnalyticsService processed last dispatch request");
                    return;
                }
                return;
            case 6:
                hbv hbvVar = (hbv) this.c;
                jis b = hbvVar.a.b.b();
                jer jerVar = hbvVar.a.d.a;
                Object obj3 = this.b;
                int i4 = this.a;
                Object f = hbv.f(b, obj3, i4);
                if (hbvVar.a(f, obj3)) {
                    return;
                }
                hbvVar.c(i4);
                hcc hccVar = hbvVar.a;
                if (i4 == 3) {
                    i = 40;
                } else {
                    i = 39;
                }
                ljh k = lnh.g.k();
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar = k.b;
                lnh lnhVar = (lnh) ljnVar;
                lnhVar.c = 8;
                lnhVar.a = 2 | lnhVar.a;
                if (!ljnVar.y()) {
                    k.t();
                }
                ljn ljnVar2 = k.b;
                lnh lnhVar2 = (lnh) ljnVar2;
                lnhVar2.e = 10;
                lnhVar2.a |= 32;
                if (!ljnVar2.y()) {
                    k.t();
                }
                ljn ljnVar3 = k.b;
                lnh lnhVar3 = (lnh) ljnVar3;
                lnhVar3.d = 3;
                lnhVar3.a |= 8;
                if (!ljnVar3.y()) {
                    k.t();
                }
                hiw hiwVar = hccVar.f;
                lnh lnhVar4 = (lnh) k.b;
                lnhVar4.b = i - 1;
                lnhVar4.a = 1 | lnhVar4.a;
                hiwVar.a(obj3, (lnh) k.q());
                hbvVar.a.b.h(f);
                return;
            case 7:
                int i5 = this.a;
                hbv hbvVar2 = (hbv) this.c;
                hbvVar2.c(i5);
                ((hdy) this.b).f.onClick(hbvVar2.b);
                return;
            case 8:
                Layout layout = ((TextView) ((cs) this.b).findViewById(R.id.license_activity_textview)).getLayout();
                if (layout != null) {
                    ((ScrollView) this.c).scrollTo(0, layout.getLineTop(layout.getLineForOffset(this.a)));
                    return;
                }
                return;
            case 9:
                ((idt) this.b).m(this.a + 1, (fyz) this.c);
                return;
            case 10:
                ((idm) this.b).c.o(4, (BluetoothGattCharacteristic) this.c, this.a);
                return;
            case 11:
                ((idm) this.b).c.o(2, (BluetoothGattCharacteristic) this.c, this.a);
                return;
            case 12:
                ((idm) this.b).c.o(1, (BluetoothGattCharacteristic) this.c, this.a);
                return;
            case 13:
                ((BottomSheetBehavior) this.b).K((View) this.c, this.a, false);
                return;
            default:
                jyn jynVar = (jyn) this.b;
                jyz[] jyzVarArr = jynVar.d;
                int i6 = this.a;
                jyz jyzVar = jyzVarArr[i6];
                jyzVar.getClass();
                jyzVarArr[i6] = null;
                int i7 = jynVar.e;
                while (true) {
                    Object obj4 = this.c;
                    int i8 = ((jmi) obj4).c;
                    if (i7 < i8) {
                        int i9 = i7 + 1;
                        if (!((jwq) ((jis) obj4).get(i7)).o(jyzVar)) {
                            i7 = i9;
                        } else {
                            jynVar.a();
                            jynVar.e = i9;
                            return;
                        }
                    } else {
                        jynVar.e = i8;
                        return;
                    }
                }
        }
    }

    public /* synthetic */ oa(hbv hbvVar, Object obj, int i, int i2) {
        this.d = i2;
        this.c = hbvVar;
        this.b = obj;
        this.a = i;
    }

    public /* synthetic */ oa(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public /* synthetic */ oa(Object obj, int i, Object obj2, int i2, byte[] bArr) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    public oa(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public /* synthetic */ oa(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
