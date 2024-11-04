package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmh implements fmj {
    final /* synthetic */ FrameLayout a;
    final /* synthetic */ LayoutInflater b;
    final /* synthetic */ ViewGroup c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ fmk e;

    public fmh(fmk fmkVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
        this.e = fmkVar;
    }

    @Override // defpackage.fmj
    public final int a() {
        return 2;
    }

    @Override // defpackage.fmj
    public final void b() {
        fmn fmlVar;
        this.a.removeAllViews();
        gok gokVar = this.e.d;
        LayoutInflater layoutInflater = this.b;
        ViewGroup viewGroup = this.c;
        Bundle bundle = this.d;
        try {
            Bundle bundle2 = new Bundle();
            frx.h(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                Object obj = gokVar.a;
                fmm fmmVar = new fmm(layoutInflater);
                fmm fmmVar2 = new fmm(viewGroup);
                Parcel a = ((duf) obj).a();
                duh.d(a, fmmVar);
                duh.d(a, fmmVar2);
                duh.c(a, bundle2);
                Parcel b = ((duf) obj).b(4, a);
                IBinder readStrongBinder = b.readStrongBinder();
                if (readStrongBinder == null) {
                    fmlVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof fmn) {
                        fmlVar = (fmn) queryLocalInterface;
                    } else {
                        fmlVar = new fml(readStrongBinder);
                    }
                }
                b.recycle();
                StrictMode.setThreadPolicy(threadPolicy);
                frx.h(bundle2, bundle);
                this.a.addView((View) fmm.b(fmlVar));
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }
}
