package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvz extends fku {
    private static volatile Bundle v;
    private static volatile Bundle w;
    public final String t;
    public final String u;
    private final HashMap x;

    public fvz(Context context, Looper looper, fhr fhrVar, fhs fhsVar, String str, fkp fkpVar) {
        super(context.getApplicationContext(), looper, 5, fkpVar, fhrVar, fhsVar);
        this.x = new HashMap();
        this.t = str;
        this.u = fkpVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Status J(int i, Bundle bundle) {
        PendingIntent pendingIntent;
        if (bundle == null) {
            pendingIntent = null;
        } else {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        return new Status(i, null, pendingIntent);
    }

    public final synchronized void I(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        fwa.a = bundle.getBoolean("use_contactables_api", true);
        fwg.a.b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        v = bundle.getBundle("config.email_type_map");
        w = bundle.getBundle("config.phone_type_map");
    }

    public final void K(fip fipVar, int i) {
        super.x();
        fvv fvvVar = new fvv(fipVar);
        try {
            fvs L = L();
            Parcel a = L.a();
            duh.d(a, fvvVar);
            a.writeInt(0);
            a.writeInt(0);
            a.writeString(null);
            a.writeString(null);
            a.writeInt(i);
            L.c(305, a);
        } catch (RemoteException unused) {
            fvvVar.b(8, null, null);
        }
    }

    public final fvs L() {
        return (fvs) super.v();
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (queryLocalInterface instanceof fvs) {
            return (fvs) queryLocalInterface;
        }
        return new fvs(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.people.service.START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return fuw.z;
    }

    @Override // defpackage.fkn
    protected final Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.t);
        bundle.putString("real_client_package_name", this.u);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    @Override // defpackage.fkn
    public final void y() {
        synchronized (this.x) {
            if (m()) {
                for (fvu fvuVar : this.x.values()) {
                    fvuVar.a.a();
                    try {
                        try {
                            L().e(fvuVar, false, 0);
                        } catch (IllegalStateException e) {
                            fma.t("PeopleService is in unexpected state", e);
                        }
                    } catch (RemoteException e2) {
                        fma.t("Failed to unregister listener", e2);
                    }
                }
            }
            this.x.clear();
        }
        super.y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final void z(int i, IBinder iBinder, Bundle bundle, int i2) {
        Bundle bundle2;
        if (i == 0) {
            i = 0;
            if (bundle != null) {
                I(bundle.getBundle("post_init_configuration"));
            }
        }
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = bundle.getBundle("post_init_resolution");
        }
        super.z(i, iBinder, bundle2, i2);
    }
}
