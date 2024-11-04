package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpo extends bps {
    @Override // defpackage.bps
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.bps
    public final void b(bqb bqbVar) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 31) {
            return;
        }
        Notification.Builder builder = bqbVar.b;
        CharSequence charSequence2 = null;
        builder.setContentTitle(null);
        Bundle bundle = this.a.v;
        if (bundle != null && bundle.containsKey("android.text")) {
            charSequence = this.a.v.getCharSequence("android.text");
        } else {
            charSequence = null;
        }
        if (charSequence != null) {
            charSequence2 = charSequence;
        }
        builder.setContentText(charSequence2);
        bpn.b(builder, "call");
    }

    @Override // defpackage.bps
    public final void i(Bundle bundle) {
        super.i(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }
}
