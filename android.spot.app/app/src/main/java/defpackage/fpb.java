package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpb extends fpg {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ fpc c;

    public fpb(Intent intent, WeakReference weakReference, fpc fpcVar) {
        this.a = intent;
        this.b = weakReference;
        this.c = fpcVar;
    }

    @Override // defpackage.fpg
    public final void b(GoogleHelp googleHelp) {
        SafeParcelable safeParcelable;
        ViewGroup viewGroup;
        this.a.putExtra("EXTRA_START_TICK", System.nanoTime());
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            this.c.l(fpd.a);
            return;
        }
        googleHelp.z = fgp.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        charSequence = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.c = charSequence;
        }
        fpc fpcVar = this.c;
        Intent intent = this.a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator creator = InProductHelp.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            if (byteArrayExtra == null) {
                safeParcelable = null;
            } else {
                fma.aR(creator);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                obtain.setDataPosition(0);
                safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
                obtain.recycle();
            }
            InProductHelp inProductHelp = (InProductHelp) safeParcelable;
            inProductHelp.a = googleHelp;
            Parcel obtain2 = Parcel.obtain();
            fnp.a(inProductHelp, obtain2, 0);
            byte[] marshall = obtain2.marshall();
            obtain2.recycle();
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", marshall);
        }
        new fqw(Looper.getMainLooper()).post(new fbh((Object) activity, (Object) intent, 11, (byte[]) null));
        fpcVar.n(Status.b);
    }
}
