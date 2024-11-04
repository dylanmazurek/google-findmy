package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.adm.R;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evo {
    private static final jnk b = jnk.l("com/google/android/apps/adm/messages/SnackbarUtil");
    public jer a = jdl.a;

    public static /* synthetic */ void f(Activity activity, Intent intent) {
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) b.f()).i(e)).j("com/google/android/apps/adm/messages/SnackbarUtil", "lambda$createLearnMoreSnackbarAction$4", (char) 183, "SnackbarUtil.java")).r("Could not find appropriate activity for handling learn more link");
        }
    }

    public static /* synthetic */ void g(Activity activity, Intent intent) {
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) b.f()).i(e)).j("com/google/android/apps/adm/messages/SnackbarUtil", "lambda$createSettingsSnackbarAction$5", (char) 199, "SnackbarUtil.java")).r("Could not find appropriate activity for entering setting page");
        }
    }

    private final void h(Activity activity, View view, evh evhVar, jer jerVar, Function function, boolean z) {
        jer i;
        Object apply;
        if (evhVar.b.b.booleanValue() && !z) {
            ((jni) ((jni) b.g()).j("com/google/android/apps/adm/messages/SnackbarUtil", "showSnackbarInternal", 116, "SnackbarUtil.java")).r("Ignoring request to show snackbar only above device panel.");
            return;
        }
        if (!evhVar.d) {
            Consumer consumer = evhVar.c;
            if (consumer != null) {
                consumer.accept(evhVar);
            }
            Bundle bundle = evhVar.a;
            int i2 = bundle.getInt("message_resource_id");
            if (!((Boolean) this.a.b(new eww(i2, 1)).e(false)).booleanValue()) {
                evj evjVar = evhVar.b;
                int a = evjVar.c.a() - 1;
                byte[] bArr = null;
                if (a != 1) {
                    if (a != 2) {
                        if (a == 3) {
                            apply = function.apply(bundle);
                            i = (jer) apply;
                        } else {
                            i = jdl.a;
                        }
                    } else {
                        i = jer.i(new evn(R.string.learn_more, new ecp(activity, new Intent("android.intent.action.VIEW", Uri.parse(evjVar.c.b())), 11, bArr)));
                    }
                } else {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                    i = jer.i(new evn(R.string.settings, new ecp(activity, intent, 12, bArr)));
                }
                iwk o = iwk.o(view, i2, evhVar.b.a);
                if (jerVar.g()) {
                    int intValue = ((Integer) jerVar.c()).intValue();
                    View findViewById = o.h.findViewById(intValue);
                    if (findViewById != null) {
                        iwe iweVar = o.l;
                        if (iweVar != null) {
                            iweVar.a();
                        }
                        iwe iweVar2 = new iwe(o, findViewById);
                        if (findViewById.isAttachedToWindow()) {
                            hwx.l(findViewById, iweVar2);
                        }
                        findViewById.addOnAttachStateChangeListener(iweVar2);
                        o.l = iweVar2;
                        o.m = true;
                    } else {
                        throw new IllegalArgumentException(a.ae(intValue, "Unable to find anchor view with id: "));
                    }
                }
                if (i.g()) {
                    int i3 = ((evn) i.c()).a;
                    View.OnClickListener onClickListener = ((evn) i.c()).b;
                    CharSequence text = o.i.getText(i3);
                    Button button = o.p().b;
                    int i4 = 8;
                    if (!TextUtils.isEmpty(text)) {
                        o.v = true;
                        button.setVisibility(0);
                        button.setText(text);
                        button.setOnClickListener(new hgq(o, onClickListener, i4, bArr));
                    } else {
                        button.setVisibility(8);
                        button.setOnClickListener(null);
                        o.v = false;
                    }
                }
                this.a = jer.i(Integer.valueOf(i2));
                o.n(new evm(this));
                o.i();
                evhVar.e = o;
                o.n(new evg(evhVar));
                return;
            }
            return;
        }
        ((jni) ((jni) b.g()).j("com/google/android/apps/adm/messages/SnackbarUtil", "showSnackbarInternal", 120, "SnackbarUtil.java")).r("Skipping snackbar as it was already dismissed.");
    }

    public final void a(ag agVar, evh evhVar) {
        h(agVar.F(), agVar.K(), evhVar, jdl.a, new evl(2), false);
    }

    public final void b(ag agVar, evh evhVar, int i) {
        c(agVar, evhVar, i, new evl(3));
    }

    public final void c(ag agVar, evh evhVar, int i, Function function) {
        d(agVar, evhVar, jer.i(Integer.valueOf(i)), function);
    }

    public final void d(ag agVar, evh evhVar, jer jerVar, Function function) {
        h(agVar.F(), agVar.K(), evhVar, jerVar, function, false);
    }

    public final void e(Activity activity, evh evhVar) {
        h(activity, activity.findViewById(R.id.container_map_and_bottom_sheet), evhVar, jer.i(Integer.valueOf(R.id.bottom_sheet_fragment_container)), new evl(0), true);
    }
}
