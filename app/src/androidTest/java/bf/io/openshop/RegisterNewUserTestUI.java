package bf.io.openshop;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import bf.io.openshop.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;

import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import bf.io.openshop.UX.MainActivity;

import static android.support.test.espresso.action.ViewActions.typeText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class RegisterNewUserTestUI {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void registerUser() throws Exception{

        onView(withId(R.id.action_wish_list)).perform(click());

        Thread.sleep(15000);
        onView(withId(R.id.login_form_registration_btn)).perform(click());
        Thread.sleep(15000);
        onView(withId(R.id.login_registration_email_text_auto))
                .perform(typeText("sasi.batchu2277@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.login_registration_password_auto))
                .perform(typeText("Test@123"), closeSoftKeyboard());
        Thread.sleep(5000);
        onView(withId(R.id.login_registration_sex_man)).perform(click());
        onView(withId(R.id.login_registration_confirm)).perform(click());
        Thread.sleep(15000);
    }

    //@Test
    public void loginTest() throws Exception{
        onView(withId(R.id.login_form_email_btn)).perform(click());
        Thread.sleep(15000);
        onView(withId(R.id.product_add_to_cart_image)).perform(click());
        Thread.sleep(15000);

    }
}