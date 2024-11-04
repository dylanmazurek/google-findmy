package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import j$.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgj extends fqw {
    final /* synthetic */ fgk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgj(fgk fgkVar, Looper looper) {
        super(looper);
        this.a = fgkVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            fgk fgkVar = this.a;
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new fga());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                    fgkVar.f = (CloudMessagingMessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    fgkVar.e = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            if (Objects.equals(intent2.getAction(), "com.google.android.c2dm.intent.REGISTRATION")) {
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
                        return;
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && Objects.equals(split[1], "ID")) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            fgkVar.c(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    synchronized (fgkVar.c) {
                        int i = 0;
                        while (true) {
                            ta taVar = fgkVar.c;
                            if (i < taVar.d) {
                                fgkVar.c((String) taVar.c(i), intent2.getExtras());
                                i++;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = fgk.b.matcher(stringExtra);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        fgkVar.c(group, extras);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
