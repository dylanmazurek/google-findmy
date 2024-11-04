package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frp extends ag {
    public final fmk a = new fmk(this);

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        fmk fmkVar = this.a;
        fmkVar.b(bundle, new fmh(fmkVar, frameLayout, layoutInflater, viewGroup, bundle));
        if (fmkVar.d == null) {
            fgp fgpVar = fgp.a;
            Context context = frameLayout.getContext();
            int f = fgpVar.f(context);
            String c = fkq.c(context, f);
            String b = fkq.b(context, f);
            LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            TextView textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setText(c);
            linearLayout.addView(textView);
            Intent h = fgpVar.h(context, f, null);
            if (h != null) {
                Button button = new Button(context);
                button.setId(R.id.button1);
                button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                button.setText(b);
                linearLayout.addView(button);
                button.setOnClickListener(new ecp(context, h, 14));
            }
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // defpackage.ag
    public final void X(Bundle bundle) {
        ClassLoader classLoader = frp.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.X(bundle);
    }

    @Override // defpackage.ag
    public final void Z(Activity activity) {
        super.Z(activity);
        this.a.d(activity);
    }

    @Override // defpackage.ag
    public final void ab() {
        fmk fmkVar = this.a;
        gok gokVar = fmkVar.d;
        if (gokVar != null) {
            try {
                Object obj = gokVar.a;
                ((duf) obj).c(8, ((duf) obj).a());
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        } else {
            fmkVar.a(1);
        }
        super.ab();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ag
    public final void ac(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        String string;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.ac(activity, attributeSet, bundle);
            this.a.d(activity);
            Parcelable.Creator creator = GoogleMapOptions.CREATOR;
            LatLngBounds latLngBounds = null;
            if (attributeSet != null) {
                TypedArray obtainAttributes = activity.getResources().obtainAttributes(attributeSet, fro.a);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                if (obtainAttributes.hasValue(16)) {
                    googleMapOptions.d = obtainAttributes.getInt(16, -1);
                }
                if (obtainAttributes.hasValue(26)) {
                    googleMapOptions.b = Boolean.valueOf(obtainAttributes.getBoolean(26, false));
                }
                if (obtainAttributes.hasValue(25)) {
                    googleMapOptions.c = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
                }
                if (obtainAttributes.hasValue(17)) {
                    googleMapOptions.g = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
                }
                if (obtainAttributes.hasValue(19)) {
                    googleMapOptions.k = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
                }
                if (obtainAttributes.hasValue(21)) {
                    googleMapOptions.r = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
                }
                if (obtainAttributes.hasValue(20)) {
                    googleMapOptions.h = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
                }
                if (obtainAttributes.hasValue(22)) {
                    googleMapOptions.j = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
                }
                if (obtainAttributes.hasValue(24)) {
                    googleMapOptions.i = Boolean.valueOf(obtainAttributes.getBoolean(24, true));
                }
                if (obtainAttributes.hasValue(23)) {
                    googleMapOptions.f = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
                }
                if (obtainAttributes.hasValue(13)) {
                    googleMapOptions.l = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
                }
                if (obtainAttributes.hasValue(18)) {
                    googleMapOptions.m = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
                }
                if (obtainAttributes.hasValue(0)) {
                    googleMapOptions.n = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
                }
                if (obtainAttributes.hasValue(4)) {
                    googleMapOptions.o = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
                }
                if (obtainAttributes.hasValue(4)) {
                    googleMapOptions.p = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
                }
                if (obtainAttributes.hasValue(1)) {
                    googleMapOptions.s = Integer.valueOf(obtainAttributes.getColor(1, GoogleMapOptions.a.intValue()));
                }
                if (obtainAttributes.hasValue(15) && (string = obtainAttributes.getString(15)) != null && !string.isEmpty()) {
                    googleMapOptions.t = string;
                }
                if (obtainAttributes.hasValue(14)) {
                    googleMapOptions.u = obtainAttributes.getInt(14, 0);
                }
                TypedArray obtainAttributes2 = activity.getResources().obtainAttributes(attributeSet, fro.a);
                float f9 = 0.0f;
                if (obtainAttributes2.hasValue(11)) {
                    f = Float.valueOf(obtainAttributes2.getFloat(11, 0.0f));
                } else {
                    f = null;
                }
                if (obtainAttributes2.hasValue(12)) {
                    f2 = Float.valueOf(obtainAttributes2.getFloat(12, 0.0f));
                } else {
                    f2 = null;
                }
                if (obtainAttributes2.hasValue(9)) {
                    f3 = Float.valueOf(obtainAttributes2.getFloat(9, 0.0f));
                } else {
                    f3 = null;
                }
                if (obtainAttributes2.hasValue(10)) {
                    f4 = Float.valueOf(obtainAttributes2.getFloat(10, 0.0f));
                } else {
                    f4 = null;
                }
                obtainAttributes2.recycle();
                if (f != null && f2 != null && f3 != null && f4 != null) {
                    latLngBounds = new LatLngBounds(new LatLng(f.floatValue(), f2.floatValue()), new LatLng(f3.floatValue(), f4.floatValue()));
                }
                googleMapOptions.q = latLngBounds;
                TypedArray obtainAttributes3 = activity.getResources().obtainAttributes(attributeSet, fro.a);
                if (obtainAttributes3.hasValue(5)) {
                    f5 = obtainAttributes3.getFloat(5, 0.0f);
                } else {
                    f5 = 0.0f;
                }
                if (obtainAttributes3.hasValue(6)) {
                    f6 = obtainAttributes3.getFloat(6, 0.0f);
                } else {
                    f6 = 0.0f;
                }
                LatLng latLng = new LatLng(f5, f6);
                if (obtainAttributes3.hasValue(8)) {
                    f7 = obtainAttributes3.getFloat(8, 0.0f);
                } else {
                    f7 = 0.0f;
                }
                if (obtainAttributes3.hasValue(2)) {
                    f8 = obtainAttributes3.getFloat(2, 0.0f);
                } else {
                    f8 = 0.0f;
                }
                if (obtainAttributes3.hasValue(7)) {
                    f9 = obtainAttributes3.getFloat(7, 0.0f);
                }
                obtainAttributes3.recycle();
                googleMapOptions.e = new CameraPosition(latLng, f7, f9, f8);
                obtainAttributes.recycle();
                latLngBounds = googleMapOptions;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", latLngBounds);
            fmk fmkVar = this.a;
            fmkVar.b(bundle, new fmf(fmkVar, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // defpackage.ag
    public final void ad() {
        fmk fmkVar = this.a;
        gok gokVar = fmkVar.d;
        if (gokVar != null) {
            try {
                Object obj = gokVar.a;
                ((duf) obj).c(6, ((duf) obj).a());
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        } else {
            fmkVar.a(5);
        }
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        fmk fmkVar = this.a;
        fmkVar.b(null, new fmi(fmkVar, 0));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.g(bundle);
            fmk fmkVar = this.a;
            fmkVar.b(bundle, new fmg(fmkVar, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // defpackage.ag
    public final void h() {
        fmk fmkVar = this.a;
        gok gokVar = fmkVar.d;
        if (gokVar != null) {
            try {
                Object obj = gokVar.a;
                ((duf) obj).c(7, ((duf) obj).a());
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        } else {
            fmkVar.a(2);
        }
        super.h();
    }

    @Override // defpackage.ag
    public final void j(Bundle bundle) {
        ClassLoader classLoader = frp.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        fmk fmkVar = this.a;
        gok gokVar = fmkVar.d;
        if (gokVar != null) {
            try {
                Bundle bundle2 = new Bundle();
                frx.h(bundle, bundle2);
                Object obj = gokVar.a;
                Parcel a = ((duf) obj).a();
                duh.c(a, bundle2);
                Parcel b = ((duf) obj).b(10, a);
                if (b.readInt() != 0) {
                    bundle2.readFromParcel(b);
                }
                b.recycle();
                frx.h(bundle2, bundle);
                return;
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        }
        Bundle bundle3 = fmkVar.a;
        if (bundle3 != null) {
            bundle.putAll(bundle3);
        }
    }

    @Override // defpackage.ag
    public final void k() {
        super.k();
        fmk fmkVar = this.a;
        fmkVar.b(null, new fmi(fmkVar, 1));
    }

    @Override // defpackage.ag
    public final void l() {
        fmk fmkVar = this.a;
        gok gokVar = fmkVar.d;
        if (gokVar != null) {
            try {
                Object obj = gokVar.a;
                ((duf) obj).c(16, ((duf) obj).a());
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        } else {
            fmkVar.a(4);
        }
        super.l();
    }

    @Override // defpackage.ag, android.content.ComponentCallbacks
    public final void onLowMemory() {
        gok gokVar = this.a.d;
        if (gokVar != null) {
            try {
                Object obj = gokVar.a;
                ((duf) obj).c(9, ((duf) obj).a());
            } catch (RemoteException e) {
                throw new fsc(e);
            }
        }
        super.onLowMemory();
    }
}
